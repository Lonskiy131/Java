package com.education.ztu;

public class Car{
    String brand;
    Engine engine;
    public Car(String brand) {
        this.brand = brand;
        this.engine=new Engine();
    }

    public boolean engineIsRunning() {
        return engine.isEngineWorks();
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

     class Engine{
         boolean engineWorks;

         public Engine () {
             this.engineWorks = false;
         }

         public boolean isEngineWorks() {
            return engineWorks;
        }


        public void startEngine(){
            engineWorks=true;
        }
        public void stopEngine(){
            engineWorks=false;
        }


    }
}

