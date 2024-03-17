package com.education.ztu.game;

import java.util.Comparator;
import java.util.TreeSet;

public class Game {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Mike", 11);
        Schoolar schoolar2 = new Schoolar("Timur", 13);
        Student student1 = new Student("larisa", 19);
        Student student2 = new Student("UgHan", 22);
        Employee employee1 = new Employee("Shao", 41);
        Employee employee2 = new Employee("Martin", 38);
        Team<Schoolar> scollarTeam = new Team<>("SchoolTeam");
        scollarTeam.addNewParticipant(schoolar1);
        scollarTeam.addNewParticipant(schoolar2);


        Team<Student> studentTeam = new Team<>("StudentTeam");
        studentTeam.addNewParticipant(student2);
        studentTeam.addNewParticipant(student1);
        Team<Employee> employeeTeam = new Team<>("WorkersTeam");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        System.out.println(studentTeam);

        Team<Schoolar> scollarTeam2 = new Team<>("SecondSchoolTeam");
        Schoolar schoolar3 = new Schoolar("Antonio", 14);
        Schoolar schoolar4 = new Schoolar("Shein", 17);
        scollarTeam2.addNewParticipant(schoolar3);
        scollarTeam2.addNewParticipant(schoolar4);
        scollarTeam.playWith(scollarTeam2);

        Comparator<Participant> student_comp = new ParticipantNameComparator().thenComparing(new ParticipantAgeComparator());
        TreeSet<Participant> participants = new TreeSet<>(student_comp);
        participants.addAll(studentTeam.getParticipants());
        System.out.println(studentTeam.getParticipants());
        for(Participant p: participants){
            System.out.println(p);
        }
    }
}
