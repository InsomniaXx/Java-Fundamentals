package Fundamentals.Fundamentials_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "\\b(?<firstName>[A-Z][a-z]+) (?<lastName>[A-Z][a-z]+)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
           // System.out.print(matcher.group() + " ");
            System.out.print(matcher.group("firstName") + " " + matcher.group("lastName") + " ");
        }
    }
}
