package br.com.mateus.crud.endpoint.dto;

import br.com.mateus.crud.endpoint.domain.Review;
import br.com.mateus.crud.endpoint.domain.User;

import java.io.Serializable;

public class ReviewDTO implements Serializable {
    private Long id;
    private User user;
    private String description;
    private Short rate;

    public ReviewDTO(Long id, User user, String description, Short rate){
        super();
        this.id = id;
        this.user = user;
        this.description = description;
        this.rate = rate;
    }
    public ReviewDTO(Review review){
        this.id = review.getId();
        this.user = review.getUser();
        this.description = review.getDescription();
        this.rate = review.getRate();
    }

    public Long getId() {
        return id;
    }
    public User getUser() {
        return user;
    }
    public String getDescription() {
        return description;
    }
    public Short getRate() {
        return rate;
    }
}
