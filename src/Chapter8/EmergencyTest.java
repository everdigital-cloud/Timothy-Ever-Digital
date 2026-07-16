package Chapter8;

public class EmergencyTest {
    public static void main(String[] args) {
        Time2 time=new Time2(20,30,50);
        Emergency Emg1=new Emergency("Timothy","08103618110", "Nigeria", time,
                "Java want to kill me", "Good","Positive");
        System.out.println(Emg1);
    }
}
