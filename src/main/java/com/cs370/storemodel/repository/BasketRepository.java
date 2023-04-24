package com.cs370.storemodel.repository;

import com.cs370.storemodel.model.Basket;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasketRepository extends CrudRepository<Basket, Long> {
}
