package org.reusax.employees;

public class Manager extends Employee {

    private Degrees degree;
    public Manager(String name, String ID, double grossSalary, Degrees degree) {
        super(name, ID, grossSalary);
        this.degree = degree;
    }

    @Override
    public double getNetSalary() {

        double taxes = 0.9;
        double netSalary = this.getGrossSalary()*taxes;
        return netSalary;
    }

    @Override
    public double getGrossSalary() {
        double netSalary;

        switch (degree){
            case BSc:
                netSalary = super.getGrossSalary()*1.1;
                break;
            case MSc:
                netSalary = super.getGrossSalary()*1.2;
                break;
            case PhD:
                netSalary = super.getGrossSalary()*1.35;
                break;
            default:
                netSalary = super.getGrossSalary();
                break;
        }

        return netSalary;
    }

    public Degrees getDegree() {
        return degree;
    }

    public void setDegree(Degrees degree) {
        this.degree = degree;
    }
}
