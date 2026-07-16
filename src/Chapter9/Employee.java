package Chapter9;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocialSecurityNumber(){return socialSecurityNumber;}

    public String toString(){return String.format("%s%n%s%n%s: %s%n",
            getFirstName(),getLastName(),"social security number", getSocialSecurityNumber());
    }
}