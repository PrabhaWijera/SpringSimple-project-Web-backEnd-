package com.example.testingspringproject.Controller;

import com.example.testingspringproject.Service.impl.CustomerServiceimpl;
import com.example.testingspringproject.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServiceimpl customerServiceimpl;

    @GetMapping
    public String getCustomerCheck(CustomerDto customerDto){
        System.out.println(customerDto.toString());
        return "CustomerGet"+customerDto.toString();
    }
/*

    @PostMapping(consumes =MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer_DTO postJSON(@RequestBody  Customer_DTO customer_dto) {
        System.out.println("Customer_DTO : " + customer_dto.toString());
        return customer_dto;
    }

*/

    @PostMapping(value = "customerDto")
    public void SaveCustomerCkek(CustomerDto customerDto){
        System.out.println("hIT CUSTOMER SAVE COMTROLLER");
          customerServiceimpl.CustomerSave(customerDto);
    }

    @PutMapping
    public String Update_Customer(){
        return "Update_Customer";
    }

    @DeleteMapping
    public String Delete_Customer(){
        return "Delete_Customer";
    }

}
