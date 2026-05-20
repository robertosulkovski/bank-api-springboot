package com.roberto.bankapi.domain.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String agency;

    @Column(nullable = false)
    private BigDecimal balance = BigDecimal.ZERO;

    @Column(name = "account_limit", nullable = false)
    private BigDecimal limit = BigDecimal.ZERO;

    public Account() {
    }

    public Account(
            String number,
            String agency,
            BigDecimal balance,
            BigDecimal limit) {

        this.number = number;
        this.agency = agency;
        this.balance = balance != null
                ? balance
                : BigDecimal.ZERO;

        this.limit = limit != null
                ? limit
                : BigDecimal.ZERO;
    }

    public Long getId() {
        return id;
    }

    // opcional manter para JPA
    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {

        if (number == null || number.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Número da conta não pode ser vazio");
        }

        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {

        if (agency == null || agency.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Agência não pode ser vazia");
        }

        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {

        this.balance = balance != null
                ? balance
                : BigDecimal.ZERO;
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