package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("Message")
public class Message {
    @Id
    private String id;

    private String user_id;
    private String discussion_id;
    private String text;
    private Date date;


    public Message(String id, String user_id, String discussion_id, String text, Date date) {
        this.id = id;
        this.user_id = user_id;
        this.discussion_id = discussion_id;
        this.text = text;
        this.date = date;
    }



    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDiscussion_id() {
        return this.discussion_id;
    }

    public void setDiscussion_id(String discussion_id) {
        this.discussion_id = discussion_id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
