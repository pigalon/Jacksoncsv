package com.spring.study.csv.model;

/**
 * Created by pierrickmolera on 26/01/2017.
 */
public class CatVehicle {

    public String id;

    public String brand;

//    @Column(name = "tariff")
    public String tariff;

//    @Column(name = "model")
    public String model;

//    @Column(name = "motorization")
    public String motorization;

//    @Column(name = "finishing")
    public String finishing;

//    @Column(name = "engine")
    public String engine;

//    @Column(name = "gear")
    public String gear;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTariff() {
        return tariff;
    }

    public void setTariff(String tariff) {
        this.tariff = tariff;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotorization() {
        return motorization;
    }

    public void setMotorization(String motorization) {
        this.motorization = motorization;
    }

    public String getFinishing() {
        return finishing;
    }

    public void setFinishing(String finishing) {
        this.finishing = finishing;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String buildId() {
        return brand + "|" + tariff + "|" +
               model + "|" + motorization + "|" +
               finishing + "|" + engine + "|" +
               gear;
    }

    @Override
    public String toString() {
        return "CatVehicle{" +
                "id='"+id + '\'' +
                "brand='" + brand + '\'' +
                ", tariff='" + tariff + '\'' +
                ", model='" + model + '\'' +
                ", motorization='" + motorization + '\'' +
                ", finishing='" + finishing + '\'' +
                ", engine='" + engine + '\'' +
                ", gear='" + gear + '\'' +
                '}';
    }
}
