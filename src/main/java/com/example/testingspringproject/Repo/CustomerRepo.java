package com.example.testingspringproject.Repo;

import com.example.testingspringproject.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity,String> {
}
