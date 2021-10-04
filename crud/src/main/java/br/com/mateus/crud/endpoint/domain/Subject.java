package br.com.mateus.crud.endpoint.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Subject implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 255)
    private String description;

    public Subject(String title, String description){
        this.title = title;
        this.description = description;
    }

    public Subject() {}

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
}
