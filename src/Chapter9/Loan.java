package Chapter9;

public class Loan {
    private final double principal;
    private final double rate;
    private final int month;
    public Loan(double principal, double rate, int month){
        if (principal<0.0){
            throw new IllegalArgumentException("Principal should be >=0.0");
        }
        this.principal=principal;
        if (rate<=0.0||rate>=1.0){
            throw new IllegalArgumentException("Rate should be >0.0 and <1.0");
        }
        this.rate=rate;
        this.month=month;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }
    public double totalAmountWithInterest(){
        return principal+(principal*rate);
    }

    public int getMonth() {
        return month;
    }

    public double montlyInstallment(){
        return totalAmountWithInterest()/getMonth();
    }


    @Override
    public String toString() {
        return String.format("Lone Details: %nPrincipal: %.2f%nRate: %.2f%nDuration: %dmonth%nTotal amount with" +
                " interest: %.2f%nMontly installment amout: %.2f%n",getPrincipal(),getRate(),getMonth(),totalAmountWithInterest(),montlyInstallment());
    }
}
