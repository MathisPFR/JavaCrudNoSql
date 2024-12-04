package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users") // Annotation pour MongoDB
public class User {

    @Id
    private String id; // Identifiant unique

    private String name;
    private String email;
    private String password;
    private String schoolId; // Champ renommé pour respecter camelCase
    private String refNum;

    // Constructeur par défaut
    public User() {
    }

    // Constructeur complet sans l'id (géré par la base de données)
    public User(String name, String email, String password, String schoolId, String refNum) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.schoolId = schoolId;
        this.refNum = refNum;
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public void setId(String id) { // Le type de paramètre est corrigé en Long
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }
}
