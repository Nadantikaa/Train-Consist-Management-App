class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String id;
    String shape;
    String cargo;

    GoodsBogie(String id, String shape) {
        this.id = id;
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            System.out.println("\nAttempting to assign " + cargoType + " to Bogie " + id + " (" + shape + ")...");

            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("CRITICAL SAFETY VIOLATION: Petroleum cannot be carried in a Rectangular bogie!");
            }

            this.cargo = cargoType;
            System.out.println("Success: Cargo assigned.");

        } catch (CargoSafetyException e) {
            System.out.println("Caught Exception: " + e.getMessage());

        } finally {
            System.out.println("Logging: Cargo assignment validation process completed for Bogie " + id + ".");
        }
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        GoodsBogie bogie1 = new GoodsBogie("GB101", "Cylindrical");
        GoodsBogie bogie2 = new GoodsBogie("GB102", "Rectangular");

        bogie1.assignCargo("Petroleum");

        bogie2.assignCargo("Petroleum");

        bogie2.assignCargo("Coal");

        System.out.println("\n--- Final Status ---");
        System.out.println("Program execution continued successfully after handling exceptions.");
    }
}