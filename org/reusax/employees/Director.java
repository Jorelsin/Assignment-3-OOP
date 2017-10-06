package org.reusax.employees;

public class Director extends Manager {

    private String department;

    public Director(String name, String ID, double grossSalary, String degree, String department) {
        super(name, ID, grossSalary, degree);
        this.department = department;
    }

    @Override
    public double getNetSalary() {

        double BaseSalary = super.getGrossSalary()+Corporation.Bonus;
        double NetSalary;
        double SmallTaxes = 0.9;
        double MediumTaxes = 0.8;
        double LargeTaxes = 0.6;
        double FirstTaxLine = 30000;
        double SecondTaxLine = 50000;
        double preRichAmount = SecondTaxLine*MediumTaxes;

        if (BaseSalary < FirstTaxLine){
            NetSalary = BaseSalary*SmallTaxes;
        }else if (BaseSalary < SecondTaxLine){
            NetSalary = BaseSalary*MediumTaxes;
        }else {
            BaseSalary = (BaseSalary-SecondTaxLine)*LargeTaxes;
            NetSalary = BaseSalary+preRichAmount;
        }

        return NetSalary;
    }

    @Override
    public double getGrossSalary() {
        return super.getGrossSalary()+ReusaxCorp.Bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
