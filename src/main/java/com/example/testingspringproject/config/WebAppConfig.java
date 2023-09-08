package com.example.testingspringproject.config;


import com.example.testingspringproject.Bean.TestingBeansOption;
import com.example.testingspringproject.Controller.CustomerController;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackageClasses = {CustomerController.class, TestingBeansOption.class})
public class WebAppConfig {

    public WebAppConfig(){
        System.out.println("WebAppConfiguration");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
