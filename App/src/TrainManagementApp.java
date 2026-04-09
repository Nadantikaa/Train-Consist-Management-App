import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bogie {
    String id;
    String type;

    Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Type: " + type;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {
        List<Bogie> trainConsist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Train Consist Management App ===");

        while (running) {
            System.out.println("\n1. Add Bogie");
            System.out.println("2. Display Consist");
            System.out.println("3. Search Bogie by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Bogie ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Bogie Type: ");
                    String type = scanner.nextLine();
                    trainConsist.add(new Bogie(id, type));
                    System.out.println("Bogie added successfully.");
                    break;
                case 2:
                    System.out.println("\n--- Current Train Consist ---");
                    if (trainConsist.isEmpty()) {
                        System.out.println("The train is empty.");
                    } else {
                        trainConsist.forEach(System.out::println);
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    String searchId = scanner.nextLine();
                    boolean found = false;
                    for (Bogie b : trainConsist) {
                        if (b.id.equalsIgnoreCase(searchId)) {
                            System.out.println("Found: " + b);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Bogie not found.");
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}