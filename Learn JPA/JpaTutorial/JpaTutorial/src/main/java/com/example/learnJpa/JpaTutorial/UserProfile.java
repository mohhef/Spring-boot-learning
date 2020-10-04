package com.example.learnJpa.JpaTutorial;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserProfile {
    @Id
    private Integer id;
    private int age;
    private String gender;
    private String favoriteColor;
    @OneToOne
    private User user;
}