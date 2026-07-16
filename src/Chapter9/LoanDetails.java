package Chapter9;

public class LoanDetails {
    public static void main(String[] args) {
        HomeLoan loan1=new HomeLoan(300,.1,12);
        System.out.println(loan1);

        VehicleLoan loan2=new VehicleLoan(3000,.1,12);
        System.out.println(loan2);

        PersonalLoan loan3=new PersonalLoan(6000,.1,12);
        System.out.println(loan3);
    }
}
