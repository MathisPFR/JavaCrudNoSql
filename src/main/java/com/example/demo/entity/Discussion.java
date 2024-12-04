package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("Discussion")
public class Discussion {
    @Id
    private String id;


    private String subject;
    private String description; 
    private String author_id;
    private Date createdAt;


    public Discussion(String id, String subject, String description, String author_id, Date createdAt) {
        this.id = id;
        this.subject = subject;
        this.description = description;
        this.author_id = author_id;
        this.createdAt = createdAt;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor_id() {
        return this.author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
}