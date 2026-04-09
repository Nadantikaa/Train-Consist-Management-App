import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        boolean isSafe = goodsBogies.stream().allMatch(bogie -> {
            if (bogie.getType().equalsIgnoreCase("Cylindrical")) {
                return bogie.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true;
        });

        System.out.println("\n--- Safety Compliance Check ---");
        if (isSafe) {
            System.out.println("Status: Train is safety compliant.");
        } else {
            System.out.println("Status: Train is UNSAFE! Cargo mismatch detected.");
        }
    }
}