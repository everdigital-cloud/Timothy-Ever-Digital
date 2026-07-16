

package Chapter10;

public abstract class Employee {
    private  final  String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public  String getSocialSecurityNumber(){return socialSecurityNumber;}

    public String toString(){
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    public abstract double earnings();
}
 /*package Chapter10;

import Chapter8.Date;
import Chapter8.Time2;

public abstract class Employee {
    private  final  String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDay;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDay){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
        this.birthDay=birthDay;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public  String getSocialSecurityNumber(){return socialSecurityNumber;}
    public Date getBirthDay;

    public String toString(){
        return String.format("%s %s%nsocial security number: %s%n%s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDay);
    }
    public abstract double earnings();
}*/
/*
package Chapter10;

public abstract class Employee {
    private  final  String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
    }
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public  String getSocialSecurityNumber(){return socialSecurityNumber;}

    public String toString(){
        return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
    public abstract double earnings();
}
 */