import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        validateInput(trainId, cargoCode);
    }

    public static void validateInput(String trainId, String cargoCode) {
        String trainIdRegex = "TRN-\\d{4}";
        String cargoCodeRegex = "PET-[A-Z]{2}";

        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        Matcher trainIdMatcher = trainIdPattern.matcher(trainId);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);

        System.out.println("\n--- Validation Results ---");

        if (trainIdMatcher.matches()) {
            System.out.println("Train ID " + trainId + ": Valid");
        } else {
            System.out.println("Train ID " + trainId + ": Invalid (Format: TRN-1234)");
        }

        if (cargoCodeMatcher.matches()) {
            System.out.println("Cargo Code " + cargoCode + ": Valid");
        } else {
            System.out.println("Cargo Code " + cargoCode + ": Invalid (Format: PET-AB)");
        }
    }
}