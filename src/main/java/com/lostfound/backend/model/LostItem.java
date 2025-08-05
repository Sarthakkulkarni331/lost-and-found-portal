

package com.lostfound.backend.model;

import jakarta.persistence.*;

@Entity
public class LostItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String itemName;
    private String description;
    private String location;
    private String date;
    private String contact;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String gettype() { return type; }
    public void settype(String type) { this.type = type;}

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}
