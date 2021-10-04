package com.example.inditex.repository;

import com.example.inditex.persistence.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inditex.persistence.Prices;

import java.time.LocalDateTime;
import java.util.List;

public interface PricesRepository extends JpaRepository<Prices, Integer> {

    List<Prices> findByLessThanEqualEndDateAndGreatherThanEqualStartDateAndProductAndBrand(LocalDateTime date, Integer product, Brand brand);

}