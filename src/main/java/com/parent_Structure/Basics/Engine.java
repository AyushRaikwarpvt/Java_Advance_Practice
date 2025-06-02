package com.parent_Structure.Basics;

public class Engine {
    private  String CarEngine;

    public String getCarEngine() {
        return CarEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "CarEngine='" + CarEngine + '\'' +
                '}';
    }

    public void setCarEngine(String carEngine) {
        CarEngine = carEngine;
    }


    public Engine(String carEngine) {
        CarEngine = carEngine;
    }
    public void CarEngines(){
        System.out.println("car was Started");
    }
    public Engine(){
        super();
    }
}
