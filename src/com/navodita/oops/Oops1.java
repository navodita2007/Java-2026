package com.navodita.oops;

public class Oops1 {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();// created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //  p1.setColor("Yellow");
        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }
}

class BankAccount1 {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen1 {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
    //    void setTip(int newTip) {
    //   this.tip = newTip;
    // }
}

class Student1 {
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}