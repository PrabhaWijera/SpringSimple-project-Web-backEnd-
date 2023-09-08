package com.example.testingspringproject.Service;

import com.example.testingspringproject.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    void CustomerSave(CustomerDto customerDto);

    void CustomerUpdate(CustomerDto customerDto);

    void Customer_Delete(String id);

    void search(String id);

    public List<CustomerDto>getAll();
}
