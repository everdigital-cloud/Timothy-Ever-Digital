package Chapter10;

import Chapter8.Date;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDay, double grossSale, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber,birthDay, grossSale, commissionRate);
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary=baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary()+super.earnings();
    }
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
/*
package Chapter10;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary=baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary()+super.earnings();
    }
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}

 */
