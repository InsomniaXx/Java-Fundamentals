package Fundamentals.Fundamentials_MidExams.Second;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            StringBuilder sb = new StringBuilder();

            if (matcher.find()) {
                for (int j = 0; j < input.length(); j++) {
                    if (Character.isDigit(input.charAt(j))) {
                        sb.append(input.charAt(j));
                    }
                }
                if (sb.length() > 0) {
                    System.out.println("Product group: " + sb.toString());
                } else {
                    System.out.println("Product group: 00");
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
