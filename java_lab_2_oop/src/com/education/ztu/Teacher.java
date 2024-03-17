package com.education.ztu;

public class Teacher extends Person{

    private Car car;
    private String subject;
    private String university;

    private int id;
    public static int counter=1;

    public Teacher (String firstname, Gender gender, String lastname, Location location, int age, Car car, String subject, String university) {
        super(firstname, gender, lastname, location, age);
        this.car = car;
        this.subject = subject;
        this.university = university;
        this.id=counter;
        counter++;
    }

    public Teacher (Car car, String subject, String university) {
        this.car = car;
        this.subject = subject;
        this.university = university;
        this.id=counter;
        counter++;
    }
    private static int getCounter () {
        return counter;
    }


    public  int showCounter () {
        return counter;
    }


    @Override
    public String getFullinfo () {
        return firstname+lastname+university;
    }
    @Override
    public void getOccupation() {

    }


    public Car getCar () {
        return car;
    }

    public String getSubject () {
        return subject;
    }

    public String getUniversity () {
        return university;
    }

    public void setCar (Car car) {
        this.car = car;
    }

    public void setSubject (String subject) {
        this.subject = subject;
    }

    public void setUniversity (String university) {
        this.university = university;
    }
}
