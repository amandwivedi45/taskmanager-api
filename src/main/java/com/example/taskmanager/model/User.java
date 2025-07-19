package com.taskmanager.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;

    // getters and setters
}
