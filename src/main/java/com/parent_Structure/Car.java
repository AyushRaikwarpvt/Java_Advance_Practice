package com.parent_Structure;

public class Car {
    private  String CarName;
    private  String CarNumber;

    Engine engine;

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarName='" + CarName + '\'' +
                ", CarNumber='" + CarNumber + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Car(String carName, String carNumber, Engine engine) {
        this.CarName = carName;
        this.CarNumber = carNumber;
        this.engine = engine;
    }

    public boolean Carstart() {
        engine.CarEngines();
        return false;
    }
    public  Car(){
        super();
    }
}
