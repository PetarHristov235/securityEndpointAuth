package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.util.List;

@Entity(name = "menu")
@AllArgsConstructor
@NoArgsConstructor
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menuIdSeqGenerator")
    @SequenceGenerator(name = "menuIdSeqGenerator", sequenceName = "menu_id_seq", allocationSize = 1)
    Long id;

    @OneToMany
    @JoinColumn(name = "menu_id")
    List<FoodEntity> food;

    @CreatedDate
    Instant createdOn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<FoodEntity> getFood() {
        return food;
    }

    public void setFood(List<FoodEntity> food) {
        this.food = food;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }
}
