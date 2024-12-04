package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Ressource")
public class Ressource {
    @Id
    private String id;

    private String title;
    private String url;
    private String type;
    


    public Ressource(String id, String title, String url, String type) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.type = type;
    }


    
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}