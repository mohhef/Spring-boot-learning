package com.example.learnJpa.JpaTutorial;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Multiple_Author {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> book = new HashSet<>();
}
