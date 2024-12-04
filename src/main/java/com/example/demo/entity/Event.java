package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document("Event") // Annotation indiquant que cette classe correspond à une collection MongoDB
public class Event {

    @Id
    private String id; // Identifiant unique de l'événement

    private String title;
    private String description;
    private String category;
    private Boolean isPublic; // Champ renommé pour éviter l'utilisation du mot-clé "public"
    private String city;
    private String schoolId; // Champ renommé en camelCase
    private Date startDate; // Champ renommé en camelCase
    private Date endDate;   // Champ renommé en camelCase

    // Constructeur par défaut requis par certains frameworks comme Spring
    public Event() {
    }

    // Constructeur avec paramètres
    public Event(String id, String title, String description, String category, String city, String schoolId, Date startDate, Date endDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.city = city;
        this.schoolId = schoolId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters et setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
