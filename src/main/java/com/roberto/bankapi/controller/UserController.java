package com.roberto.bankapi.controller;

import com.roberto.bankapi.domain.model.User;
import com.roberto.bankapi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {

        return repository.findAll();

    }

    @GetMapping("/{id}")
    public User findById(
            @PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Usuário não encontrado"));

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(
            @RequestBody User user) {

        validateUser(user);

        return repository.save(user);

    }

    @PutMapping("/{id}")
    public User update(
            @PathVariable Long id,
            @RequestBody User user) {

        User existingUser = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Usuário não encontrado"));

        validateUser(user);

        existingUser.setName(user.getName());
        existingUser.setAccount(user.getAccount());
        existingUser.setCard(user.getCard());
        existingUser.setFeatures(user.getFeatures());
        existingUser.setNews(user.getNews());

        return repository.save(existingUser);

    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(
            @PathVariable Long id) {

        if (!repository.existsById(id)) {

            throw new IllegalArgumentException(
                    "Usuário não encontrado");

        }

        repository.deleteById(id);

    }

    private void validateUser(
            User user) {

        if (user == null) {

            throw new IllegalArgumentException(
                    "Dados do usuário inválidos");

        }

        if (user.getName() == null
                || user.getName().isBlank()) {

            throw new IllegalArgumentException(
                    "Nome obrigatório");

        }

        if (user.getAccount() == null) {

            throw new IllegalArgumentException(
                    "Conta obrigatória");

        }

        if (user.getCard() == null) {

            throw new IllegalArgumentException(
                    "Cartão obrigatório");

        }

    }

}