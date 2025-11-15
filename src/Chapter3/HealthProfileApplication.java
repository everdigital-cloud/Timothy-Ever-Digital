package Chapter3;

public class HealthProfileApplication {
    public static void main(String[] args) {

        HealthProfile profile1 = new HealthProfile("Jane", "Bleu", "Male", 2,
                3, 2011, 50, 60);

   System.out.printf("First name: %s%nLast name: %s%nGender: %s%nMonth of birth: %d%nDay of birth: %d%nYear of birth:" +
                   " %d%nHeight: %.2f%nWeight: %.2f%nMaximum hearth rate: %d%nTarget heart rate range: " +
                   "%.2f to %.2f%nBody mass index: %.2f", profile1.getFirstName(),profile1.getLastName(),
           profile1.getGender(), profile1.getMonthOfBirth(), profile1.getDayOfBirth(), profile1.getYearOfBirth(),
           profile1.getHeight(), profile1.getWeight(), profile1.maxHeartRate(), profile1.lowerTargetHeartRate(),
           profile1.upperTargetHeartRate(), profile1.bodyMassIndex());
    }
}

