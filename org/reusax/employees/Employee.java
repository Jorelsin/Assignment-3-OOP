package org.reusax.employees;

public class Employee {

 private String name;
 private String ID;
 private double grossSalary;

    public Employee(String name, String ID, double grossSalary) {
        this.name = name;
        this.ID = ID;
        this.grossSalary = grossSalary;
    }

    public double getNetSalary(){
        return this.grossSalary*0.9;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString (){
        return this.ID+": "+this.name;
    }
}
