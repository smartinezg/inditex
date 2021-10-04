package com.example.inditex.controllers;

import com.example.inditex.persistence.Prices;
import com.example.inditex.repository.PricesRepository;
import com.example.inditex.services.PricesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Path;
import java.util.List;

@Controller
@RequestMapping(value = "/prices")
public class PricesController {

    @Autowired
    private PricesServices pricesServices;

    @GetMapping
    public @ResponseBody
    ResponseEntity<List<Prices>> getAllPrices() {
        return pricesServices.getAllPrices();
    }

    @GetMapping(path = "/{date}/{product}/{brand}")
    public @ResponseBody
    ResponseEntity<List<Prices>> findProduct(@PathVariable String date, @PathVariable String product, @PathVariable String brand) {
        return pricesServices.findProduct(date, product, brand);
    }

}