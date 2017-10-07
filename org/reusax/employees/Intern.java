package org.reusax.employees;

public class Intern extends Employee {

    private int GPA;

    public Intern(String name, String ID, double grossSalary,int GPA) {
        super(name, ID, grossSalary);
        this.GPA = GPA;
    }

    @Override
    public double getNetSalary(){

        double netSalary;
        double studyBonus = 1000;

        if (GPA <= 5){
            netSalary = 0;
        }else if (GPA > 8){
            netSalary = super.getGrossSalary()+studyBonus;
        }else {
            netSalary = super.getGrossSalary();
        }
        return netSalary;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}
