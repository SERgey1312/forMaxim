package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int teachersNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeachersNumber() {
        return teachersNumber;
    }

    public void setTeachersNumber(int teachersNumber) {
        this.teachersNumber = teachersNumber;
    }
}
