package com.parent_Structure;

public class Calculate {
    private int a;
    private int b;

    public Calculate(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("This is Local Cpn");
    }

    @Override
    public String toString() {
        return "Calculate{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Calculate(double a, double b) {
        this.a = (int)a;
        this.b = (int)b;
        System.out.println("this is double Con");
    }

    public void  Sum(){
        System.out.println(a+b);
    }

}
