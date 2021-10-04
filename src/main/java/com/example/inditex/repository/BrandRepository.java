package com.example.inditex.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.inditex.persistence.Brand;

public interface BrandRepository extends CrudRepository<Brand, Integer> {
}