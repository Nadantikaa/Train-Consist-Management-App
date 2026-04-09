import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        displayConsistSummary(trainConsist);

        trainConsist.remove("AC Chair");

        if (trainConsist.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists.");
        }

        displayConsistSummary(trainConsist);
    }

    public static void displayConsistSummary(List<String> consist) {
        System.out.println("\n--- Current Consist Summary ---");
        System.out.println("Total Bogies: " + consist.size());
        System.out.println("Current Bogies: " + consist);
    }
}