package com.example.mongoDb.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongoDb.demo.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

}
