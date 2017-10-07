package org.reusax.employees;

public class Director extends Manager {

    private Departments department;

    public Director(String name, String ID, double grossSalary, Degrees degree, Departments department) {
        super(name, ID, grossSalary, degree);
        this.department = department;
    }

    @Override
    public double getNetSalary() {

        double baseSalary = super.getGrossSalary()+Corporation.Bonus;
        double netSalary;
        double smallTaxes = 0.9;
        double mediumTaxes = 0.8;
        double largeTaxes = 0.6;
        double firstTaxLine = 30000;
        double secondTaxLine = 50000;
        double preRichAmount = secondTaxLine*mediumTaxes;

        if (baseSalary < firstTaxLine){
            netSalary = baseSalary*smallTaxes;
        }else if (baseSalary < secondTaxLine){
            netSalary = baseSalary*mediumTaxes;
        }else {
            baseSalary = (baseSalary-secondTaxLine)*largeTaxes;
            netSalary = baseSalary+preRichAmount;
        }

        return netSalary;
    }

    @Override
    public double getGrossSalary() {
        return super.getGrossSalary()+ReusaxCorp.Bonus;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public enum Departments {

        Bussnies,
        Technical,
        Human_Reasources,

    }
}
