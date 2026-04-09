import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Consist: " + trainConsist);

        System.out.println("Inserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("Current Consist: " + trainConsist);

        System.out.println("\nDetaching first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\n--- Final Ordered Train Consist ---");
        System.out.println("Total Bogies: " + trainConsist.size());
        System.out.println("Physical Sequence: " + trainConsist);
        List<String> trainConsist = new ArrayList<>();
        Set<String> uniqueBogieIds = new HashSet<>();

        addBogie(trainConsist, uniqueBogieIds, "BG101", "Sleeper");
        addBogie(trainConsist, uniqueBogieIds, "BG102", "AC Chair");
        addBogie(trainConsist, uniqueBogieIds, "BG103", "First Class");
        addBogie(trainConsist, uniqueBogieIds, "BG101", "General");

        displayConsistSummary(trainConsist, uniqueBogieIds);

        System.out.println("\nRemoving AC Chair...");
        trainConsist.remove("AC Chair");
        uniqueBogieIds.remove("BG102");

        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie is still attached.");
        }

        displayConsistSummary(trainConsist, uniqueBogieIds);
    }

    public static void addBogie(List<String> consist, Set<String> ids, String id, String type) {
        if (ids.add(id)) {
            consist.add(type);
            System.out.println("Added: " + type + " (ID: " + id + ")");
        } else {
            System.out.println("Error: Bogie ID " + id + " already exists. Duplicate rejected.");
        }
    }

    public static void displayConsistSummary(List<String> consist, Set<String> ids) {
        System.out.println("\n--- Current Consist Summary ---");
        System.out.println("Total Bogies: " + consist.size());
        System.out.println("Physical Order: " + consist);
        System.out.println("Registered IDs: " + ids);
    }
}