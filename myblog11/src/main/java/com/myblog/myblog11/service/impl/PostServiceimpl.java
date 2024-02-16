package com.myblog.myblog11.service.impl;

import com.myblog.myblog11.entity.Post;
import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.repository.PostRepsitory;
import com.myblog.myblog11.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceimpl implements PostService{
    private  PostRepsitory postRepository; // Corrected typo in variable name

    public PostServiceimpl(PostRepsitory postRepository) {
        this.postRepository = postRepository; // Corrected variable name
    }

    @Override
    public PostDto createPost(PostDto postDto) { // Corrected parameter name
       Post post =new Post();
       post.setTitle(postDto.getTitle());
       post.setDescription(postDto.getDescription());
       post.setContent(postDto.getContent());

        Post savedPost = postRepository.save(post);
        PostDto dto =new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return dto ;
    }
}

