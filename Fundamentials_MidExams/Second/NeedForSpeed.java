package Fundamentals.Fundamentials_MidExams.Second;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carMileageList = new TreeMap<>();
        Map<String, Integer> carFuelList = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] carsInput = scanner.nextLine().split("\\|");
            String name = carsInput[0];
            int mileage = Integer.parseInt(carsInput[1]);
            int fuel = Integer.parseInt(carsInput[2]);

            carMileageList.put(name, mileage);
            carFuelList.put(name, fuel);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] nextCommand = command.split(" : ");
            String action = nextCommand[0];
            String carName = nextCommand[1];
            int carDistance = 0;
            int carFuel = 0;
            int carKm = 0;

            switch (action) {
                case "Drive":
                    carDistance = Integer.parseInt(nextCommand[2]);
                    carFuel = Integer.parseInt(nextCommand[3]);

                    driveCar(carMileageList, carFuelList, carName, carDistance, carFuel);
                    break;
                case "Refuel":
                    carFuel = Integer.parseInt(nextCommand[2]);
                    refuelCar(carFuelList, carName, carFuel);

                    break;
                case "Revert":
                    carKm = Integer.parseInt(nextCommand[2]);
                    revertCar(carMileageList, carName, carKm);

                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        carMileageList.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(element ->
                        System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", element.getKey(), element.getValue(), carFuelList.get(element.getKey())));
    }
    private static void driveCar(Map<String, Integer> carMileageList, Map<String, Integer> carFuelList, String carName, int carDistance, int carFuel) {
        int currentFuel = carFuelList.get(carName) - carFuel;

        if (currentFuel >= 0) {
            carMileageList.put(carName, carMileageList.get(carName) + carDistance);
            carFuelList.put(carName, carFuelList.get(carName) - carFuel);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, carDistance, carFuel);
        } else {
            System.out.println("Not enough fuel to make that ride");
        }

        if (carMileageList.get(carName) >= 100000) {
            carMileageList.remove(carName);
            carFuelList.remove(carName);
            System.out.printf("Time to sell the %s!%n", carName);
        }
    }
    private static void refuelCar(Map<String, Integer> carFuelList, String carName, int carFuel) {
        int fuelToRefill = carFuelList.get(carName) + carFuel;

        if (fuelToRefill < 75) {
            carFuelList.put(carName, fuelToRefill);
            System.out.printf("%s refueled with %d liters%n", carName, carFuel);
        } else {
            int currentRefill = Math.abs(carFuelList.get(carName) - 75);
            carFuelList.put(carName, carFuelList.get(carName) + currentRefill);
            System.out.printf("%s refueled with %d liters%n", carName, currentRefill);
        }
    }
    private static void revertCar(Map<String, Integer> carMileageList, String carName, int carKm) {
        int currentMileage = carMileageList.get(carName) - carKm;

        if (currentMileage > 10000) {
            carMileageList.put(carName, currentMileage);
            System.out.printf("%s mileage decreased by %d kilometers%n", carName, carKm);
        } else {
            carMileageList.put(carName, 10000);
        }
    }
}
