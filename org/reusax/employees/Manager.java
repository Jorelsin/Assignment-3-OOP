package org.reusax.employees;

public class Manager extends Employee {

    private String degree;
    public Manager(String name, String ID, double grossSalary, String degree) {
        super(name, ID, grossSalary);
        this.degree = degree;
    }

    @Override
    public double getNetSalary() {

        double taxes = 0.9;
        double NetSalary = this.getGrossSalary()*taxes;
        return NetSalary;
    }

    @Override
    public double getGrossSalary() {
        double NetSalary;
        double BScSalary  = super.getGrossSalary()*1.1;
        double MScSalary  = super.getGrossSalary()*1.2;
        double PhDSalary  = super.getGrossSalary()*1.35;

        switch (degree){
            case ("BSc"):
                NetSalary = BScSalary;
                break;
            case ("MSc"):
                NetSalary = MScSalary;
                break;
            case ("PhD"):
                NetSalary = PhDSalary;
                break;
            default:
                NetSalary = super.getGrossSalary();
                break;
        }

        return NetSalary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
