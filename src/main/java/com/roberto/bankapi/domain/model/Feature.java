package com.roberto.bankapi.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_feature")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String icon;

    @Column(nullable = false)
    private String description;

    public Feature() {
    }

    public Feature(String icon, String description) {
        this.icon = icon;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {

        if (icon == null || icon.trim().isEmpty()) {
            throw new IllegalArgumentException("Icon não pode ser vazio");
        }

        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description não pode ser vazia");
        }

        this.description = description;
    }

}