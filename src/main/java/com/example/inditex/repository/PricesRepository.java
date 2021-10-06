package com.example.inditex.repository;

import com.example.inditex.persistence.Brand;
import com.example.inditex.persistence.Prices;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PricesRepository extends JpaRepository<Prices, Integer> {

  @Query(value = "FROM Prices p WHERE p.startDate <= :date AND p.endDate >= :date AND p.brand = :brand AND p.productId = :product ")
  List<Prices> findByDate(LocalDateTime date, Brand brand, Integer product);
  /*List<Prices> findAllByEndDateLessThanEqualAndStartDateGreaterThanEqualAndProductIdAndBrand(
      LocalDateTime start, LocalDateTime end, String product, Brand brand);*/

}