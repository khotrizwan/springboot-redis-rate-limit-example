package com.sodel.throtting.demo.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {
    
    @GetMapping("/all")
    public String getAllClients() {
        return "Get all clients...";
    }

    @GetMapping("/get/{id}")
    public String getById(@PathVariable("id") String id) {
        return "Get by id ..." + id;
    }
}
