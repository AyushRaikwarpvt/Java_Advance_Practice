package com.parent_Structure.Rivision;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private String Student_Name;
    private  int Student_Roll;
    private String Subject;
    @Autowired(required = false)
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "Student_Name='" + Student_Name + '\'' +
                ", Student_Roll=" + Student_Roll +
                ", Subject='" + Subject + '\'' +
                ", adress=" + adress +
                ", subject=" + subjects +
                '}';
    }

    public void setSubject(Subject subject) {
        this.subjects = subject;
    }


    private Adress adress;
    private  Subject subjects;

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public int getStudent_Roll() {
        return Student_Roll;
    }

    public void setStudent_Roll(int student_Roll) {
        Student_Roll = student_Roll;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    @Autowired
    public Student(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }


    public void setAdress(Adress adress) {
        this.adress = adress;
    }



}
