package Chapter9;

public class HomeLoan extends Loan{
    private final int months;
    public HomeLoan(double principal,double rate, int months){
        super(principal, rate, months);
        if (months<=0){
            throw new IllegalArgumentException("Month should be > 0");
        }
        this.months=months;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
