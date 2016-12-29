package com.spring.study.csv;


import com.spring.study.csv.model.User;
import com.spring.study.csv.service.CSVDataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class CsvApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(CsvApplication.class, args);

        CSVDataLoader cdl = ctx.getBean(CSVDataLoader.class);

        List<User> users = cdl.loadObjectList(User.class, "users");

        for(User user : users){
            System.out.println("u : " + user.toString());
        }
    }
}
