package com.example.inditex.repository;

import com.example.inditex.persistence.Brand;
import com.example.inditex.persistence.Prices;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricesRepository extends JpaRepository<Prices, Integer> {

  List<Prices> findByEndDateLessThanEqualAndStartDateGreaterThanEqualAndProductIdAndBrand(
      LocalDateTime start, LocalDateTime end, String product, Brand brand);

}