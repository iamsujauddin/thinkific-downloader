package com.video.download.thinkific.dto;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Root{
    public Course course;
    public ArrayList<Content> contents;
    public ArrayList<Chapter> chapters;
    public ArrayList<Object> community_product_relations;
    public ArrayList<Object> sales_funnels;
    public ArrayList<Product> products;

    public ArrayList<Content> getContents() {
        return contents;
    }

    public void setContents(ArrayList<Content> contents) {
        this.contents = contents;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public ArrayList<Object> getCommunity_product_relations() {
        return community_product_relations;
    }

    public void setCommunity_product_relations(ArrayList<Object> community_product_relations) {
        this.community_product_relations = community_product_relations;
    }

    public ArrayList<Object> getSales_funnels() {
        return sales_funnels;
    }

    public void setSales_funnels(ArrayList<Object> sales_funnels) {
        this.sales_funnels = sales_funnels;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}