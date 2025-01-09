package com.video.download.thinkific.controller;

import com.video.download.thinkific.dto.Response;
import com.video.download.thinkific.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private DownloadService downloadService;

    @GetMapping("/down")
    public ResponseEntity<Response> dwonloadVideo(){
        System.out.println("hi");

        Response response= downloadService.downloadVideos();

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/hi")
    public String sayHi(){
        System.out.println("hi");
        return "hi sk";
    }

}
