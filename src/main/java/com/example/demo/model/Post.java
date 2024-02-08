package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;


@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Integer likes;
    private Date creationDate;

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.title = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public Post() {

    }


    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(int count) {
        this.likes = count;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getcreationDate() {
        return this.creationDate;
    }

    public Long getId() {
        return this.id;
    }
}
