package com.spring.study.csv.repository;

import com.spring.study.csv.model.CatVehicle;
import org.springframework.stereotype.Repository;

/**
 * Created by pierrickmolera on 26/01/2017.
 */
@Repository
public interface CatVehicleRepository {

    Iterable<CatVehicle> findAll();

    CatVehicle save(CatVehicle user);

    CatVehicle findVehicle(Long id);

    void deleteVehicle(Long id);
}
