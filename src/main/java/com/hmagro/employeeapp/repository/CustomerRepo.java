package com.hmagro.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hmagro.employeeapp.data.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	

    @Query(value = "select * from customer c where c.customer_name LIKE %:keyword% OR CAST(c.primary_number AS text) LIKE %:keyword% ", nativeQuery = true)
    List<Customer> findByKeyword(@Param("keyword") String keyword);
}
