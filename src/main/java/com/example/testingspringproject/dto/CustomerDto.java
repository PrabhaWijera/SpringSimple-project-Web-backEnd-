package com.example.testingspringproject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CustomerDto {

    private String cus_id;
    private String cus_name;
    private String cus_address;
    private int cus_number;
}
