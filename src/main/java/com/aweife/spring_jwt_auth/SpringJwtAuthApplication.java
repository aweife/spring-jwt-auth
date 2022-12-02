package com.aweife.spring_jwt_auth;

import com.aweife.spring_jwt_auth.model.Post;
import com.aweife.spring_jwt_auth.repo.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJwtAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtAuthApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository posts) {
        return args -> {
            posts.save(new Post("Hello world", "hello-world","This is the first post","ted"));
            posts.save(new Post("Hello world again", "hello-world","This is the second post","ted"));
        };
    }
}
