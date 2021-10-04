package com.example.inditex.services;

import com.example.inditex.persistence.Brand;
import com.example.inditex.persistence.Prices;
import com.example.inditex.repository.BrandRepository;
import com.example.inditex.repository.PricesRepository;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PricesServices {

  @Autowired
  private PricesRepository pricesRepository;

  @Autowired
  private BrandRepository brandRepository;

  public ResponseEntity<List<Prices>> getAllPrices() {
    List<Prices> prices = (List<Prices>) pricesRepository.findAll();
    return new ResponseEntity<>(prices, HttpStatus.OK);
  }

  public ResponseEntity<List<Prices>> findProduct(String date, Integer product, String brandName) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm:ss");
    LocalDateTime dateTime = LocalDateTime.parse(date, formatter);

    Brand brand = brandRepository.findByBrandName(brandName);

    List<Prices> prices = (List<Prices>) pricesRepository
        .findByDate(dateTime, brand, product);
    return new ResponseEntity<>(prices, HttpStatus.OK);
  }
}
