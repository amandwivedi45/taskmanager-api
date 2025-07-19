package com.taskmanager.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id @GeneratedValue
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    private User user;

    // getters and setters
}
