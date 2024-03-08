package Matthias.week22_Carsimulation;

import java.util.Random;

public class Car {
    private String manufacture; // Hersteller
    private String model;       //Model
    private Tank tank;
    private Engine engine;
    public Car( String manufacture, String model,Engine engine, Tank tank){
        this.manufacture=manufacture;
        this.model=model;
        this.tank=tank;
        this.engine=engine;
    }

    public int drive( int kilometres){
        tank.reduceFillLevel((this.engine.getConsumption()/100));
        System.out.println("Es sind von " + this.manufacture + " aktuell Stand " + this.tank.getFillLevel()+"l");
        System.out.println("Es sind " + this.manufacture+" "+ this.engine.addMileage() +"km gefahren worden");

        return kilometres;

    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine( Engine engine ) {
        this.engine = engine;
    }

    public Tank getTank(){
        return this.tank;

    } //Gibt den Tankinhalt zurück.

    @Override
    public String toString(){
        return this.manufacture + " " + this.engine.getEngineName();
    }

}
