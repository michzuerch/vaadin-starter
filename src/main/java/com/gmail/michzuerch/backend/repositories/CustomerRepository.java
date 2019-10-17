package com.gmail.michzuerch.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.michzuerch.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
