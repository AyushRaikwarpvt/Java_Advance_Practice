package com.parent_Structure;

import com.parent_Structure.AutoWiring.AutoWiring_ByName.Employe;
import com.parent_Structure.Rivision.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
       AbstractApplicationContext  SuperObject = new ClassPathXmlApplicationContext("Bean.xml");
//        Student  StudentData = (Student) SuperObject.getBean("Student_Data");
//        Employe employessData = (Employe) SuperObject.getBean("Employess_Data");
//        Car car = (Car) SuperObject.getBean("Car");
//        Engine Engine = (Engine) SuperObject.getBean("Engine");
//        System.out.println(StudentData);
//        System.out.println(employessData);
//        System.out.println(car.Carstart());
//        Calculate  Res = (Calculate) SuperObject.getBean("Calculater");
//        System.out.println(Res);
//        Res.Sum();
//        Object mouse = SuperObject.getBean("Mouse");
        SuperObject.registerShutdownHook();
//        SuperObject.close();
//
//        KeyBoard keyBoard = (KeyBoard) SuperObject.getBean("KeyBoard");
//        System.out.println(keyBoard);
//        SuperObject.close();

//     Object laptop = SuperObject.getBean("Lapi");
//     System.out.println(laptop);
//        Employe employe = SuperObject.getBean("Emp", Employe.class);
//        System.out.println(employe);

//        Object emp = SuperObject.getBean("Emp");
//        System.out.println(emp);

//        Object docDetail = SuperObject.getBean("Doc_detail");
//        System.out.println(docDetail);
//        Object anuj = SuperObject.getBean("Anuj");
//        System.out.println(anuj);

        Student studentCls = (Student) SuperObject.getBean("Student_Cls");
        System.out.println(studentCls);
    }
}
