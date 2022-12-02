package com.aweife.spring_jwt_auth.controller;

import com.aweife.spring_jwt_auth.model.Post;
import com.aweife.spring_jwt_auth.repo.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostRepository posts;

    @GetMapping
    public List<Post> findAll(){
        return posts.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable("id") Post post){
        return post;
    }
}
