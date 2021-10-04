package com.example.inditex.controllers;

import com.example.inditex.persistence.Prices;
import com.example.inditex.repository.PricesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/prices")
public class PricesController {

  @Autowired
  private PricesRepository pricesRepository;

  @GetMapping(path = "/allPrices")
  public @ResponseBody
  ResponseEntity<List<Prices>> getAllPrices() {
    List<Prices> prices = (List<Prices>) pricesRepository.findAll();
    /*
    System.out.println(prices.size());
    for (Brand brand : prices) {
      System.out.println(brand);
    }
    */

		/*
		System.out.println(prices.size());
		if (prices == null) {
			return new ResponseEntity<>(prices, HttpStatus.NOT_FOUND);
		} else if (prices != null && !prices.iterator().hasNext()) {
			return new ResponseEntity<>(prices, HttpStatus.NOT_FOUND);
		}
		*/

    return new ResponseEntity<>(prices, HttpStatus.OK);
  }

}