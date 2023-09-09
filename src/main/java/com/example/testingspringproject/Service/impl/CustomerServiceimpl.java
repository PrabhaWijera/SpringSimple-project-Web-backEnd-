package com.example.testingspringproject.Service.impl;

import com.example.testingspringproject.Repo.CustomerRepo;
import com.example.testingspringproject.Service.CustomerService;
import com.example.testingspringproject.dto.CustomerDto;
import com.example.testingspringproject.entity.CustomerEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service

@Transactional
public class CustomerServiceimpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;



    @Override
    public void CustomerSave(CustomerDto customerDto) {
       if (!customerRepo.existsById(customerDto.getCus_id())){
           customerRepo.save(modelMapper.map(customerDto,CustomerEntity.class));

       }else {
           throw new RuntimeException("Customer already in");
       }

    }

    @Override
    public void CustomerUpdate(CustomerDto customerDto) {

    }

    @Override
    public void Customer_Delete(String id) {

    }

    @Override
    public void search(String id) {

    }

    @Override
    public List<CustomerDto> getAll() {
        return null;
    }
}
