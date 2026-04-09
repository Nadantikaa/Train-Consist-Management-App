import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        displayConsistSummary(trainConsist);

        System.out.println("\nSystem initialized. Ready for operations.");
    }

    public static void displayConsistSummary(List<String> consist) {
        System.out.println("\n--- Current Consist Summary ---");

        int bogieCount = consist.size();

        System.out.println("Total Bogies: " + bogieCount);

        if (bogieCount == 0) {
            System.out.println("Status: The train is currently empty.");
        } else {
            System.out.println("Bogies: " + consist);
        }
    }
}