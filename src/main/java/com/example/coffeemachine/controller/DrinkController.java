package com.example.coffeemachine.controller;

import com.example.coffeemachine.model.Drink;
import com.example.coffeemachine.service.DrinkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/drinks")
@Api(value="onlinecoffee", description="Operations pertaining to coffee drinks")
public class DrinkController {

    private final DrinkService drinkService;

    @Autowired
    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "View a list of available coffee drinks", response = Iterable.class)
    public ResponseEntity<List<Drink>> listDrink() {
        List<Drink> drinks = drinkService.getAll();
        return new ResponseEntity<>(drinks, HttpStatus.OK);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ApiOperation(value = "Search a coffee drinks with an ID", response = Drink.class)
    public ResponseEntity<Drink> getDrink(@PathVariable(name = "id") Long id) {
        Drink drink = drinkService.getById(id);
        return new ResponseEntity<>(drink, HttpStatus.OK);
    }

    @RequestMapping(value = "make",method = RequestMethod.POST)
    @ApiOperation(value = "Make coffee")
    public ResponseEntity<Drink> makeDrink(@RequestBody Drink drink) {
        drinkService.create(drink);
        return new ResponseEntity<>(drink, HttpStatus.OK);
    }
}
