package com.education.ztu;

public abstract  class Person implements Human {
    protected String firstname;
    protected Gender gender;
    protected String lastname;
    protected Location location;

    protected int age;

    public Person(String firstname, Gender gender, String lastname, Location location, int age) {
        this.firstname = firstname;
        this.gender = gender;
        this.lastname = lastname;
        this.location = location;
        this.age = age;
    }
    public Person() {
        this.firstname = "def firstname";
        this.gender =Gender.MALE;
        this.lastname = "def lastname";
        this.location = Location.ZHYTOMYR;
        this.age = 14;
    }

    public abstract void getOccupation();

    public void sayAge(){
        System.out.println(age);
    }

    public void sayGender() {
        System.out.println(gender);
    }

    public void sayLocation() {
        System.out.println(location);
    }

    public void sayFullName() {
        System.out.println(firstname+lastname);
    }


    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getFirstname() {
        return firstname;
    }

    public Gender getGender() {
        return gender;
    }

    public String getLastname() {
        return lastname;
    }

    public Location getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getFullinfo () {
        return firstname+lastname;
    }
}



