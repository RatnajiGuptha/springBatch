package com.guptha.spring.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guptha.spring.batch.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
