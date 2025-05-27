package com.parent_Structure;

import java.lang.reflect.Constructor;

public class Student {

    private int StudentIdl;
    private String StudetnName;
    private  String StudentAdress;


//    Getter And Setter
    public int getStudentIdl() {
        return StudentIdl;
    }
    public void setStudentIdl(int studentIdl) {
        StudentIdl = studentIdl;
    }
    public String getStudetnName() {
        return StudetnName;
    }
    public void setStudetnName(String studetnName) {
        StudetnName = studetnName;
    }
    public String getStudentAdress() {
        return StudentAdress;
    }
    public void setStudentAdress(String studentAdress) {
        StudentAdress = studentAdress;
    }

    //
//    Constructor
    public Student(String studetnName, int studentIdl, String studentAdress) {
        StudetnName = studetnName;
        StudentIdl = studentIdl;
        StudentAdress = studentAdress;
    }


//     To String Method
    @Override
    public String toString() {
        return "Student{" +
                "StudentIdl=" + StudentIdl +
                ", StudetnName='" + StudetnName + '\'' +
                ", StudentAdress='" + StudentAdress + '\'' +
                '}';
    }
// Zero Param Constructor
public  Student(){
        super();
    }


}
