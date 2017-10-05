package org.reusax.employees;

public class Intern extends Employee {

    private int GPA;

    public Intern(String name, String ID, double grossSalary,int GPA) {
        super(name, ID, grossSalary);
        this.GPA = GPA;
    }

    @Override
    public double getNetSalary(){

        double NetSalary;
        if (GPA <= 5){
            NetSalary = 0;
        }else if (GPA > 8){
            NetSalary = super.getGrossSalary()+1000;
        }else {
            NetSalary = super.getGrossSalary();
        }
        return NetSalary;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}
