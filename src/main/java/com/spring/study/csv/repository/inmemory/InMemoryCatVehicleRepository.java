package com.spring.study.csv.repository.inmemory;

import com.spring.study.csv.model.CatVehicle;
import com.spring.study.csv.repository.CatVehicleRepository;
import org.springframework.stereotype.Repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by pierrickmolera on 26/01/2017.
 */
@Repository
public class InMemoryCatVehicleRepository implements CatVehicleRepository{

    private static AtomicLong counter = new AtomicLong();

    private final ConcurrentMap<String, CatVehicle> vehicles = new ConcurrentHashMap<String, CatVehicle>();


    @Override
    public Iterable<CatVehicle> findAll() {
        return this.vehicles.values();
    }

    @Override
    public CatVehicle save(CatVehicle vehicle) {
        vehicle.setId(vehicle.buildId());
        String id = vehicle.getId();

        this.vehicles.put(id, vehicle);
        return vehicle;
    }

    @Override
    public CatVehicle findVehicle(Long id) {
        return this.vehicles.get(id);
    }

    @Override
    public void deleteVehicle(Long id) {
        this.vehicles.remove(id);
    }



}
