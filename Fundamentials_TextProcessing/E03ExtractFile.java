package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class E03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int getFileName = input.lastIndexOf("\\");
        int getFileExtension = input.lastIndexOf(".");

        String fileName = input.substring(getFileName + 1, getFileExtension);
        String extensionName = input.substring(getFileExtension + 1);

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", extensionName);
    }
}
