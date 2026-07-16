package Chapter8;

public class EmployeeTest1 {
    public static void main(String[] args) throws InterruptedException {
        Date birth=new Date(7,24,2023);
        Date hire=new Date(11 ,26,2000);
        Employee1 employee=new Employee1("Bob", "blue", birth, hire);
        System.out.println(employee);
        for (int count=0;count<130;count++) {
            hire.tick();
            displayTime("t4:", hire);
        }
    }
    private  static void displayTime(String header, Date t){
        System.out.printf("%s%n %s%n", header,t.toString());
    }
}
