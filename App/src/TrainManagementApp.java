class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " (" + capacity + " seats)";
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        try {
            System.out.println("\nAttempting to create a valid bogie...");
            Bogie validBogie = new Bogie("Sleeper", 72);
            System.out.println("Created: " + validBogie);

            System.out.println("\nAttempting to create a bogie with zero capacity...");
            Bogie zeroBogie = new Bogie("AC Chair", 0);
            System.out.println("Created: " + zeroBogie);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\nAttempting to create a bogie with negative capacity...");
            Bogie negativeBogie = new Bogie("First Class", -10);
            System.out.println("Created: " + negativeBogie);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}