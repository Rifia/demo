package com.todolist.demo.Domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "missionlist")
public class Mission {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "content")
    private String description;

    @Column(name = "dateOfCreation")
    private Date date = new Date(new java.util.Date().getTime());

    public Mission(String description) {
        this.description = description;
    }

    public Mission() {}

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }
}
