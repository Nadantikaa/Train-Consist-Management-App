import java.util.LinkedHashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("\nInitial Formation Order:");
        System.out.println(trainFormation);

        System.out.println("\nAttempting to attach duplicate 'Sleeper' bogie...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("Result: Duplicate rejected automatically.");
        }

        System.out.println("\n--- Final Ordered Train Formation ---");
        System.out.println("Total Unique Bogies: " + trainFormation.size());
        System.out.println("Physical Sequence: " + trainFormation);
    }
}