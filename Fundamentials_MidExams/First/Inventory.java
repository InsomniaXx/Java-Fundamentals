package Fundamentals.Fundamentials_MidExams.First;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays
                .stream(scanner.nextLine().split("[\\s,]+"))
                .collect(Collectors.toList());

        String nextInput = scanner.nextLine();
        String operation = "";
        String material = "";

        while (!nextInput.equals("Craft!")) {
            String command = nextInput;

            String[] nextMaterial = command.split("[\\s-]+");

            operation = nextMaterial[0];
            material = nextMaterial[1];

            if (operation.equals("Collect") && !inputList.contains(material)) {
                inputList.add(material);
            }

            for (int i = 0; i < inputList.size(); i++) {
                String[] initialMaterials = inputList.get(i).split(" ");

                switch (operation) {
                    case "Drop":
                        if (inputList.get(i).equals(material)) {
                            inputList.remove(material);
                        }
                        break;
                    case "Combine":
                        String[] newMaterial = nextMaterial[2].split(":");
                        if (inputList.get(i).equals(newMaterial[0])) {
                            inputList.add(i + 1, newMaterial[1]);
                        }
                        break;
                    case "Renew":
                        if (inputList.get(i).equals(material)) {
                            inputList.remove(material);
                            inputList.add(material);
                        }
                        break;
                    default:
                        break;
                }
            }
            nextInput = scanner.nextLine();
        }
        System.out.println(inputList.toString().replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}
