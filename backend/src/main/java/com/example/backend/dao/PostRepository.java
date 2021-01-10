package com.example.backend.dao;

import com.example.backend.dto.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  PostRepository extends MongoRepository<Post, Long> {

    public List<Post> findAll();
}