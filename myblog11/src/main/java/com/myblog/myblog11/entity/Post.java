package com.myblog.myblog11.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="posts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    public Object set;
    public Object setTitle;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;

    public void setTitle(Object title) {
    }


    public void setDescription(Object description) {
    }

    public void setContent(Object content) {
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
}
