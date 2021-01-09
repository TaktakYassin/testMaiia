package com.example.MaiiaTest.dao;

import com.example.MaiiaTest.dto.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  PostRepository extends MongoRepository<Post, Long> {

    public List<Post> findAll();
    public void deleteAll();

}