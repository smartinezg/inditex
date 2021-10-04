package com.example.inditex.controllers;

import com.example.inditex.persistence.Prices;
import com.example.inditex.services.PricesServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
  ResponseEntity<List<Prices>> findProduct(@PathVariable String date, @PathVariable Integer product,
      @PathVariable String brand) {
    return pricesServices.findProduct(date, product, brand);
  }

}