package com.sample.SpringBatch.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.SpringBatch.binding.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
