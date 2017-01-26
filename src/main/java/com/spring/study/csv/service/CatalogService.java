package com.spring.study.csv.service;


import com.spring.study.csv.model.CatVehicle;
import com.spring.study.csv.repository.inmemory.InMemoryCatVehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by pierrickmolera on 27/12/2016.
 */
@Service
public class CatalogService {

    @Autowired
    InMemoryCatVehicleRepository inMemoryCatVehicleRepository;


    public void saveCatalogue(List<CatVehicle> vehicles){
        try{
           for (CatVehicle vehicle : vehicles){
               inMemoryCatVehicleRepository.save(vehicle);
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public Iterable<CatVehicle> findAll(){
        return inMemoryCatVehicleRepository.findAll();
    }




}
