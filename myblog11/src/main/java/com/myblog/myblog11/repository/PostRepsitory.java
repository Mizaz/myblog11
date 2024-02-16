package com.myblog.myblog11.repository;

import com.myblog.myblog11.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepsitory extends JpaRepository<Post,  Long> {
}
