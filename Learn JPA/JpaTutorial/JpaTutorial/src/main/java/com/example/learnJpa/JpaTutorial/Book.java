package com.example.learnJpa.JpaTutorial;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Book")
public class Book {

    @Id
    private Integer id;
    private String name;
    @Column(name="ISBN_NUMBER")
    private String isbn;

    @ManyToOne
    @JoinColumn("AUTHOR_ID")
    private Author author;

    @ManyToMany
    @JoinTable(name = "BOOK_AUTHORS",
            joinColumns = @JoinColumn(name="BOOK_ID"),
            inverseJoinColumns = @JoinColumn(name="AUTHOR_ID")
    )
    private Set<Author> authors = new HashSet<>();


}
