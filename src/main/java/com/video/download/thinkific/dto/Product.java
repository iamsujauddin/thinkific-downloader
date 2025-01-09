package com.video.download.thinkific.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data@AllArgsConstructor@NoArgsConstructor
public class Product{
    public int id;
    public int position;
    public boolean has_certificate;
    public ArrayList<Object> community_product_relation_ids;
    public ArrayList<Object> sales_funnel_ids;
}
