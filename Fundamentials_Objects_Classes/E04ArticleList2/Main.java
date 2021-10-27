package Fundamentals.Fundamentials_Objects_Classes.E04ArticleList2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articleList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String newArticle = scanner.nextLine();
            String[] articleArray = newArticle.split(",\\s*");
            Article article = new Article(articleArray[0], articleArray[1], articleArray[2]);

            articleList.add(article);
        }
        String sortCommand = scanner.nextLine();

        switch (sortCommand) {
            case "title":
                articleList.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articleList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articleList.sort(Comparator.comparing(Article::getAuthor));
                break;
            default:
                break;
        }

        for (Article articles: articleList) {
            System.out.printf("%s - %s: %s%n", articles.getTitle(), articles.getContent(), articles.getAuthor());
        }
    }
}
