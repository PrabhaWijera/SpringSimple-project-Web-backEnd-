package com.example.testingspringproject.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Setter
@Getter
@Entity
public class CustomerEntity {
    @Id
    private String cus_id;
    private String cus_name;
    private String cus_address;
    private int cus_number;
}
