package com.aweife.spring_jwt_auth.repo;

import com.aweife.spring_jwt_auth.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
