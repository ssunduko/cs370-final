package com.cs370.storemodel;

import com.cs370.storemodel.model.*;
import com.cs370.storemodel.service.StoreModelAPI;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@SecurityScheme(
        type = SecuritySchemeType.HTTP,
        name = "basicAuth",
        scheme = "basic")
@EntityScan(basePackages = {"com.cs370.storemodel.model"})
public class SmartStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartStoreApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(StoreModelAPI storeService) {
        return args -> {

            storeService.provisionStore(1L, "75 Forbes", "My First Store", null);

            Customer customer = storeService.provisionCustomer(1L, "Sergey", "Sundukovskiy",
                    CustomerType.guest, "ssunduko@gmail.com", "75 Forbes", null );

            Basket basket  = storeService.provisionBasket(1L, null);

            storeService.assignCustomerBasket(customer.getId(), basket.getId(), null);
        };
    }

}
