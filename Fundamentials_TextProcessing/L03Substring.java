package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class L03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String text = scanner.nextLine();

//        int index = text.indexOf(key);
//        while (index != -1) {
//            text = text.replace(key, "");
//            index = text.indexOf(key);
//        }
//        System.out.println(text);

        while(text.contains(key)) {
            text = removeKey(text, key);
        }
        System.out.println(text);
    }

    private static String removeKey(String text, String key) {
        int beginIndex = text.indexOf(key);
        int endIndex = key.length() + beginIndex;

        String firstPart = text.substring(0, beginIndex);
        String secondPart = text.substring(endIndex);

        return firstPart + secondPart;
    }
}
