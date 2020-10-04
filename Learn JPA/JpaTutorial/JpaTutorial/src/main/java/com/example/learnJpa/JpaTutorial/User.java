package com.example.learnJpa.JpaTutorial;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    private Integer id;
    private String email;
    private String name;
    private String password;
    @OneToOne(mappedBy="user")
    private UserProfile profile;
}
