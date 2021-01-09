package com.example.MaiiaTest.service;

import com.example.MaiiaTest.dto.Post;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecuperateDataService {

    private RestTemplate restTemplate = new RestTemplate();

    public List<Post> getPosts(String url){
        List<Post> posts = new ArrayList<>();
        try {
            ResponseEntity<Post[]> response = restTemplate.getForEntity(url, Post[].class);
            if (response.getStatusCode() == HttpStatus.OK) {
                posts = Arrays.asList(response.getBody());
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
            throw exception;
        }
        return posts.stream().sorted((x1,x2) -> x2.getTitle().compareTo(x1.getTitle())).collect(Collectors.toList());
    }

}
