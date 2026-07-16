package Chapter9;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName,
      String socialSecurityNumber, double grossSales,
     double commissionRate, double baseSalary) {
             super(firstName, lastName, socialSecurityNumber,
                         grossSales, commissionRate);

              // if baseSalary is invalid throw exception
              if (baseSalary < 0.0) {
                     throw new IllegalArgumentException("Base salary must be >= 0.0");
                  }

              this.baseSalary = baseSalary;
           }

           // set base salarys
           public void setBaseSalary(double baseSalary) {
              if (baseSalary < 0.0) {
                     throw new IllegalArgumentException("Base salary must be >= 0.0");
                  }

              this.baseSalary = baseSalary;
           }

           // return base salary
           public double getBaseSalary() {return baseSalary;}
    public double earnings(){return getBaseSalary()+super.earnings();}
    public  String toString(){
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }

}

/*
public class BasePlusCommissionEmployee{
    private CommissionEmployee c;
    private double baseSalary;
    public BasePlusCommissionEmployee(CommissionEmployee c, double baseSalary){
        if (baseSalary<0.0){
            throw new IllegalArgumentException("Base salary must be >=0.0");
        }
        this.baseSalary=baseSalary;
        this.c=c;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {return baseSalary;}
    public String toString(){return String.format("%s: %s%n%s:, %.2f",
            "Base plus commission employee",c,"Base Salary", getBaseSalary());}
}*/

