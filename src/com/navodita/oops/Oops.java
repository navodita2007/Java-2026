package com.navodita.oops;

// learning the oops concept
public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();// created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //  p1.setColor("Yellow");
        p1.color = "yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "navoditasingh";
        myAcc.setPassword("abcdefghi");

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    // properties + functions
    String color;
    int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
/* we should write classes other than public class beneath the public class, not above the
 public class , otherwise error will occur */