package com.video.download.thinkific.service;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonArray;
import com.video.download.thinkific.dto.Chapter;
import com.video.download.thinkific.dto.Content;
import com.video.download.thinkific.dto.Response;
import com.video.download.thinkific.dto.Root;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class DownloadService {

    public Response downloadVideos() {
        String url = "https://javabrains.io/api/course_player/v2/courses/junit-basics";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        // Add cookies (ensure there are no spaces between cookies or missing semicolons)
        String cookieValue = "__cf_bm=b_slxYm9zyj5SNnXrKDKhkCXY6mnfE8l.meRdnF_kUg-1735559983-1.0.1.1-j2MNy7VP4DJAMMpkljRBRUKAzJTGdCDv9Job1.vhIJD9eLGnzwwsO0ikIwYAquwcVRx_B1JuuwOL6BUwwIoskQ; "
                + "_thinkific_session=aDZYajJSRzNhM1Y0OExlYXdpWEJUSE1MZzBoNkg0Y0dsZVArSUVZUWFURnRqN1dZZzV2YlVZTmhiOHlOQk9ya0Exb1liUFhnYUtrQm5rS1FHc3h4VmtXMHRoTHN4VVlqSkVQblkzM0tVMTZvTW9KWmIwdmNCUlV6M1h4Y3o2YXAvUjNrdVNhcXJzbWcxejFxVDBzajhMYWN6SnlBcDFGMlVzaS9sU3NJazFaR2ZHMzhNdzR2alZiNE5wclhNY0E5RzhHYThKS0tlMk1HeFdqT1Izd3ZMNTNZaHpVT1lsaTlGbCtKVExYUnUrMXpCeHJoeEtvazRVSXU4enN0akN0MWdja3AyL2h0WFZoSUF0M1ZaL3NTOWxVRWtHY25YcVNOQURtbHYvOW1vejltWE9oY0QwaXcyazlCcGZjMWVwM1JCVW1EQ2JsNUNZYy9aOSs0VUJkTFltS2pTZ2dGUDJBa2d4QVNsajVhTUtZK1FUQVJ0Ym9VbFJyZTZLcFRoalRsalVJaVFkcXhWVnUrdGlDUHpZNGF0V1pXSVFDaTdJbnFYczV4UjZBT0hRTk9kY3cyT1ZzdGM5MzR6di9UQiszaGRCbGQrS082Si93L2tyTHQyZENMYW95KzFrTTN0MS85YXVVUGdpc1Y0SStXT0JIQ1JjYVBwdW9UOU5Pb1c3V2dtN1M1N1grYjJxTDY2N3NmdWYrZ1JmSVFINkgzTmJQWktuY3FqT0JQTzB0K2pmaUpaWndoaXJyY2k0ZGJsQ0tFLS1FY2J2RXk3bHlvajA3M2JpNnVvMDFnPT0%3D--81045bbd17bf2ca555a69a4744f56da643d085d9";
        headers.add("Cookie", cookieValue);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        try {
            // Send the GET request and get the response
            ResponseEntity<Root> response = restTemplate.exchange(url, org.springframework.http.HttpMethod.GET, entity, Root.class);

            // Log the response status and body for debugging

            List<Content> contentsList=response.getBody().getContents();
            Map<Integer,String> courseName=new HashMap<>();
            Map<Integer,String> chapterName=new HashMap<>();
            Map<Integer, Set<Integer>> chapterLessiontid=new HashMap<>();
            Map<Integer, List<Integer>> chapterContentid=new HashMap<>();
            for(Chapter chapter:response.getBody().getChapters()){
                chapterContentid.put(chapter.getId(),chapter.getContent_ids());
                chapterName.put(chapter.getId(),chapter.getName());
            }
            String courseFileName=response.getBody().getCourse().getName();
            for(Map.Entry<Integer,List<Integer>> list:chapterContentid.entrySet()){
                List<Integer> chapetrwiseContentId=list.getValue();
                Set<Integer> dummyid=new HashSet<>();
                for(Integer id:chapetrwiseContentId){
                    for(Content content:contentsList){
                        if(content.getId()==id && content.getContentable_type().equalsIgnoreCase("Lesson")){
                            dummyid.add(content.getContentable());
                            courseName.put(content.getContentable(),content.getSlug());
                            break;
                        }
                    }
                }
                chapterLessiontid.put(list.getKey(),dummyid);
            }
            for(Map.Entry<Integer,Set<Integer>> map:chapterLessiontid.entrySet()){
                for(Integer number:map.getValue()){
                    System.out.println("Lession id"+number);
                    String lessionurl="https://javabrains.io/api/course_player/v2/lessons/"+number;
                    ResponseEntity<String> responseIdentifier = restTemplate.exchange(lessionurl, org.springframework.http.HttpMethod.GET, entity, String.class);
                    JsonObject jsonObject = JsonParser.parseString(responseIdentifier.getBody()).getAsJsonObject();
                    // Access the "videos" array
                    JsonArray videosArray = jsonObject.getAsJsonArray("videos");
                    // Extract the "identifier" value
                    String identifier = videosArray.get(0).getAsJsonObject().get("identifier").getAsString();
                    // Access individual values
                    String identifierUrl="https://fast.wistia.com/embed/medias/"+identifier+".json";
                    ResponseEntity<String> responseForVideoUrl = restTemplate.exchange(identifierUrl, org.springframework.http.HttpMethod.GET, entity, String.class);
                    JsonObject jsonObjectforvideo = JsonParser.parseString(responseForVideoUrl.getBody()).getAsJsonObject();

                    String mp4Url = jsonObjectforvideo.getAsJsonObject("media")
                                            .getAsJsonArray("assets").get(2).getAsJsonObject().get("url").getAsString();

                    String chapterFileName=chapterName.get(map.getKey());
                    String fileName=courseName.get(number);
                    String saveFilePath = "D:/courses/"+courseFileName+"/"+chapterFileName+"/"+fileName+".mp4";
                    Path path = Paths.get(saveFilePath).getParent();
                    if (path != null && !Files.exists(path)) {
                        Files.createDirectories(path);
                    }
                    System.out.println(fileName+ " downloading Started");
                    Files.copy(new URL(mp4Url).openStream(), Paths.get(saveFilePath), StandardCopyOption.REPLACE_EXISTING);

                    System.out.println(fileName+ " downloaded successfully to the location");

                }
            }

            System.out.println("Response Status: " + response.getStatusCode());
            System.out.println("Response Body: " + response.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
