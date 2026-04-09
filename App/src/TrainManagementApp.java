import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

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