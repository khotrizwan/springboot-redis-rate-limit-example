package com.sodel.throtting.demo;

import org.springframework.web.client.RestTemplate;

public class TestRateLimit {
  

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        for(int i = 1; i < 10; i++) {
            System.out.println(i + " --------------------- ");
            try {
                System.out.println("Get i -----> " + restTemplate.getForObject("http://localhost:8080/client/get/" + i, String.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                System.out.println("Get All -----> " + restTemplate.getForObject("http://localhost:8080/client/all", String.class));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
