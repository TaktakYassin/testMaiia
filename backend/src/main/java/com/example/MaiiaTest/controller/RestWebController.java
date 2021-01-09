package com.example.MaiiaTest.controller;

import com.example.MaiiaTest.dao.PostRepository;
import com.example.MaiiaTest.dto.Post;
import com.example.MaiiaTest.service.RecuperateDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
