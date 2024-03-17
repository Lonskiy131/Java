package com.education.ztu;



public class Main {



    public static void main(String[] args) {
      Car car1= new Car("mers");

      System.out.println(car1.engineIsRunning());
      car1.getEngine().startEngine();
      System.out.println(car1.engineIsRunning());
    }
}




