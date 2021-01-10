package com.example.backend.controller;

import com.example.backend.dao.PostRepository;
import com.example.backend.dto.Post;
import com.example.backend.service.RecuperateDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RestWebController {

    @Autowired
    private RecuperateDataService recuperateDataService;

    @Autowired
    private PostRepository postRepository;

    @PostMapping("posts")
    private void recuperatePostsFromUrl(String url){
        postRepository.deleteAll();
        List<Post> posts = recuperateDataService.getPosts(url);
        postRepository.saveAll(posts);
    }

    @GetMapping("posts")
    private List<Post> getPosts(){
        return postRepository.findAll();
    }

}
