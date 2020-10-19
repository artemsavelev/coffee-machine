package com.example.coffeemachine.service;

import com.example.coffeemachine.model.Drink;

import java.util.List;

public interface DrinkService {
    List<Drink> getAll();

    Drink getById(Long id);

    void create(Drink drink);
}
