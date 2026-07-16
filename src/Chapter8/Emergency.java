package Chapter8;

import javax.swing.table.TableRowSorter;

public class Emergency {
    /*

An important part of creating a class is determining the class’s attributes (instance variables).
For this class design exercise, research 9-1-1 services on the Internet. Then, design a class called
Emergency that might be used in an object-oriented 9-1-1 emergency response system. List the
attributes that an object of this class might use to represent the emergency. For example, the class
might include information on who reported the emergency (including their phone number), the
location of the emergency, the time of the report, the nature of the emergency, the type of response
and the status of the response. The class attributes should completely describe the nature of the
problem and what’s happening to resolve that problem.
     */
    private String nameOfTheReporter;
    private String phoneNumber;
    private String location;
    private Time2 time;
    private String natureOfTheEmergency;
    private String typeOfResponce;
    private String statusOfTheResponse;

public Emergency(String nameOfTheReporter, String phoneNumber, String location, Time2 time, String natureOfTheEmergency,
                 String typeOfResponce, String statusOfTheResponse){
    this.nameOfTheReporter=nameOfTheReporter;
    this.phoneNumber=phoneNumber;
    this.location=location;
    this.time=time;
    this.natureOfTheEmergency=natureOfTheEmergency;
    this.typeOfResponce=typeOfResponce;
    this.statusOfTheResponse=statusOfTheResponse;
}
public String toString(){
    return String.format("Name of the reporter: %s%nPhone number: %s%nLocation: %s%nTime: %s%nNature of the emergency: " +
            "%s%nType of response: %s%nStatus of the response: %s%n", nameOfTheReporter,phoneNumber,location,time,
            natureOfTheEmergency,typeOfResponce,statusOfTheResponse);
}

}
