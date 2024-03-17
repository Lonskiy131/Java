package com.education.ztu;

public class Student extends Person{
    private int course;
    private String speciality;
    private String university;

    public int id;

    public static int showCounter () {
        return counter;
    }

    public static int counter=1;

    public Student (String firstname, Gender gender, String lastname, Location location, int age, int course, String speciality, String university) {

        super(firstname, gender, lastname, location, age);
        this.course = course;
        this.speciality = speciality;
        this.university = university;
        this.id=counter;
        counter++;
    }

    public Student (int course, String speciality, String university) {
        this.course = course;
        this.speciality = speciality;
        this.university = university;
        this.id=counter;
        counter++;
    }

    private static int getCounter () {
        return counter;
    }

    @Override
    public void getOccupation() {
        System.out.println(university+" "+speciality);

    }




    public int getCourse () {
        return course;
    }

    public String getSpeciality () {
        return speciality;
    }

    public String getUniversity () {
        return university;
    }

    public void setCourse (int course) {
        this.course = course;
    }

    public void setSpeciality (String speciality) {
        this.speciality = speciality;
    }

    public void setUniversity (String university) {
        this.university = university;
    }



    @Override
    public String getFullinfo () {
        return firstname+lastname+university;
    }
}
