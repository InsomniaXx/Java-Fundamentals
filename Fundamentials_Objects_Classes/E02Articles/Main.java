package Fundamentals.Fundamentials_Objects_Classes.E02Articles;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArticle = scanner.nextLine().split(",\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        Article article = new Article(inputArticle[0], inputArticle[1], inputArticle[2]);


        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String[] commands = command.split(":\\s");

            switch (commands[0]) {
                case "Edit":
                    editContent(article, commands[1]);
                    break;
                case "ChangeAuthor":
                    changeAuthor(article, commands[1]);
                    break;
                case "Rename":
                    renameTitle(article, commands[1]);
                    break;
                default:
                    break;
            }

        }

        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }

    private static void renameTitle(Article article, String command) {
        article.setTitle(command);
    }

    private static void changeAuthor(Article article, String command) {
        article.setAuthor(command);
    }

    private static void editContent(Article article, String command) {
        article.setContent(command);
    }
}
