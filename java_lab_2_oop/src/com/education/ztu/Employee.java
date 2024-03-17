package com.education.ztu;

public class Employee extends Person {

 private Car car;
 private String company;
 private String position;
 private int id;
 public static int counter = 1;

 public Employee (String firstname, Gender gender, String lastname, Location location, int age, Car car, String company, String position, int id) {
  super(firstname, gender, lastname, location, age);
  this.car = car;
  this.company = company;
  this.position = position;
  this.id = counter;
  counter++;
 }

 public Employee (Car car, String company, String position, int id) {
  this.car = car;
  this.company = company;
  this.position = position;
  this.id = counter;
  counter++;
 }


 @Override
 public void getOccupation () {
  System.out.println(position);
 }

 @Override
 public String getFullinfo () {
  return firstname + lastname + company;
 }

 public Car getCar () {
  return car;
 }

 public String getCompany () {
  return company;
 }

 public String getPosition () {
  return position;
 }

 public void setCar (Car car) {
  this.car = car;
 }

 public void setCompany (String company) {
  this.company = company;
 }

 public void setPosition (String position) {
  this.position = position;
 }
}
