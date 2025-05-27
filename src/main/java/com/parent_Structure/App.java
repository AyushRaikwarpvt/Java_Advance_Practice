package com.parent_Structure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext SuperObject = new ClassPathXmlApplicationContext("Bean.xml");
        Student  StudentData = (Student) SuperObject.getBean("Student_Data");
        Employe employessData = (Employe) SuperObject.getBean("Employess_Data");
        System.out.println(StudentData);
        System.out.println(employessData);
    }
}
