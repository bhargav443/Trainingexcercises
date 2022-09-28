package com.Automate;
/* employee The pojo which defines the properties and behaviour of the employee*/
public class Employe {
    private String Name;
    private int age;
    private double salary;
    private int uniqueIdentifer;

    public Employe(String name, int age, double salary, int uniqueIdentifer) {

        this.Name = name;
        this.age = age;
        this.salary = salary;
        this.uniqueIdentifer = uniqueIdentifer;
    }
    public void addemploye(){
    System.out.println(this.age+" "+this.salary+" "+this.Name+" "+this.uniqueIdentifer);
}
}
