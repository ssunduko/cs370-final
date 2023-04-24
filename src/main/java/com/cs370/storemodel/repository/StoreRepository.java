package com.cs370.storemodel.repository;

import com.cs370.storemodel.model.Store;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long>{
}
