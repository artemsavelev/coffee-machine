package com.example.coffeemachine.service;

import com.example.coffeemachine.model.CupsSize;
import com.example.coffeemachine.model.Drink;
import com.example.coffeemachine.model.Statistic;
import com.example.coffeemachine.repo.DrinkRepo;
import com.example.coffeemachine.repo.StatisticRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService {

    private final DrinkRepo drinkRepo;

    private final StatisticRepo statisticRepo;

    @Autowired
    public DrinkServiceImpl(DrinkRepo drinkRepo, StatisticRepo statisticRepo) {
        this.drinkRepo = drinkRepo;
        this.statisticRepo = statisticRepo;
    }

    @Override
    public List<Drink> getAll() {
        return drinkRepo.findAll();
    }

    @Override
    public Drink getById(Long id) {
        return drinkRepo.findById(id).orElse(null);
    }

    @Override
    public void create(Drink drink) {

        Statistic statistic = new Statistic();
        statistic.setCreatedDate(LocalDateTime.now());
        statistic.setDrink(drink);
        statistic.setCupsSize(CupsSize.MEDIUM);
        statisticRepo.save(statistic);
    }
}
