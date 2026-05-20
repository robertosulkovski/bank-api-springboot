package com.roberto.bankapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberto.bankapi.domain.model.User;

public interface UserRepository
                extends JpaRepository<User, Long> {

}