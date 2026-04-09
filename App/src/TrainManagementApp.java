import java.util.LinkedList;

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
    }
}