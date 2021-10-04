package com.example.inditex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inditex.persistence.Prices;

public interface PricesRepository extends JpaRepository<Prices, Integer> {
}