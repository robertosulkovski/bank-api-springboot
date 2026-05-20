package com.roberto.bankapi.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String number;

    @Column(name = "card_limit", nullable = false)
    private BigDecimal limit = BigDecimal.ZERO;

    public Card() {
    }

    public Card(
            String number,
            BigDecimal limit) {

        this.number = number;
        this.limit = limit != null
                ? limit
                : BigDecimal.ZERO;
    }

    public Long getId() {
        return id;
    }

    // normalmente ID não precisa de setter
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {

        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Número do cartão não pode ser vazio");
        }

        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {

        this.limit = limit != null
                ? limit
                : BigDecimal.ZERO;
    }

}