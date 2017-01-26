package com.spring.study.csv;


import com.spring.study.csv.model.CatVehicle;
import com.spring.study.csv.service.CSVDataLoader;
import com.spring.study.csv.service.CatalogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Iterator;
import java.util.List;

@ComponentScan("com.spring.study.csv")
@EnableAutoConfiguration
@SpringBootApplication
public class CsvApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CsvApplication.class, args);

        CSVDataLoader cdl = ctx.getBean(CSVDataLoader.class);

        List<CatVehicle> vehicles = cdl.loadObjectList(CatVehicle.class, "vehicles.csv");


        CatalogService cu = ctx.getBean(CatalogService.class);



        cu.saveCatalogue(vehicles);

        Iterator<CatVehicle> ite = cu.findAll().iterator();
        while(ite.hasNext()){

            System.out.println("ve : " + ite.next().toString());
        }

        /*List<User> users = cdl.loadObjectList(User.class, "users");

        for(User user : users){
            System.out.println("u : " + user.toString());
        }*/
    }
}
