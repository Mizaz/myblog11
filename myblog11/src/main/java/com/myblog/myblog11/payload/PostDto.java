package com.myblog.myblog11.payload;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    public Object getTitle;
    private long id;
    private String title;
    private String description;
    private String content;


   
    public void setTitle(Object title) {
    }


    public Object getTitle() {
        return null;
    }

    public Object getDescription() {
        return null;
    }

    public Object getContent() {
        return null;
    }

    public void setDescription(Object description) {
    }

    public void setContent(Object content) {
    }
}
