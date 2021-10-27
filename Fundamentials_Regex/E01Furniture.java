package Fundamentals.Fundamentials_Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>\\d+\\.*\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new ArrayList<>();
        double finalPrice = 0;

        while (!text.equals("Purchase")) {
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double furniturePrice = Double.parseDouble(matcher.group("price"));
                int furnitureQuantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                finalPrice += furniturePrice * furnitureQuantity;
            }
            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furnitures : furniture) {
            System.out.println(furnitures);
        }
        System.out.printf("Total money spend: %.2f", finalPrice);
    }
}
