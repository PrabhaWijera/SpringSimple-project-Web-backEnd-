package com.example.testingspringproject.config;


import com.example.testingspringproject.JpaConfig.JpaCofig;
import com.example.testingspringproject.Service.impl.CustomerServiceimpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan
@EnableWebMvc
@Import({JpaCofig.class, CustomerServiceimpl.class})
public class WebRootConfig {

    public WebRootConfig(){
        System.out.println("WebRootConfiguration");
    }

}
