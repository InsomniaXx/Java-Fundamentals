package Fundamentals.Fundamentials_Objects_Classes.E06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();

        String input = scanner.nextLine();
        double averageCarsHP = 0.0;
        double averageTrucksHP = 0.0;
        int carsHP = 0;
        int trucksHP = 0;
        int countCars = 0;
        int countTrucks = 0;

        while (!input.equals("End")) {
            String nextVehicle = input;
            String[] vehicleArray = nextVehicle.split("\\s+");
            Vehicle vehicle = new Vehicle(vehicleArray[0], vehicleArray[1], vehicleArray[2], Integer.parseInt(vehicleArray[3]));
            vehicleList.add(vehicle);

            if (vehicleArray[0].equals("truck")) {
                trucksHP += vehicle.getHorsePower();
                countTrucks++;
            } else if (vehicleArray[0].equals("car")) {
                carsHP += vehicle.getHorsePower();
                countCars++;
            }
            input = scanner.nextLine();
        }

        String nextInput = scanner.nextLine();


        while (!nextInput.equals("Close the Catalogue")) {
            String nextModel = nextInput;
            List<Vehicle> finalVehicleList = new ArrayList<>();
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().contains(nextModel)) {
                    finalVehicleList.add(vehicle);
                }
            }
            for (Vehicle vehicle : finalVehicleList) {
                String type = "";
                if (vehicle.getType().contains("car")) {
                    type = "Car";
                } else if (vehicle.getType().contains("truck")) {
                    type = "Truck";
                }
                System.out.printf("Type: %s%n", type);
                System.out.printf("Model: %s%n", vehicle.getModel());
                System.out.printf("Color: %s%n", vehicle.getColor());
                System.out.printf("Horsepower: %d%n", vehicle.getHorsePower());
            }
            nextInput = scanner.nextLine();
        }
        if (countCars > 0) {
            averageCarsHP = 1.0 * carsHP / countCars;
        } else {
            averageCarsHP = 0;
        }

        if (countTrucks > 0) {
            averageTrucksHP = 1.0 * trucksHP / countTrucks;
        } else {
            averageTrucksHP = 0;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHP);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucksHP);
    }
}
