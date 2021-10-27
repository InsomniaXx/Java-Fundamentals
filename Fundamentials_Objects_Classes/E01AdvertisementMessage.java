package Fundamentals.Fundamentials_Objects_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class E01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrasesInput = "Excellent product. Such a great product., I always use that product., Best product of its category., Exceptional product., I can’t live without this product.";
        String eventsInput = "Now I feel good., I have succeeded with this product., Makes miracles. I am happy of the results!, I cannot believe but now I feel awesome., Try it yourself, I am very satisfied., I feel great!";
        String authorsInput = "Diana, Petya, Stella, Elena, Katya, Iva, Annie, Eva";
        String citiesInput = "Burgas, Sofia, Plovdiv, Varna, Ruse";

        String[] phrases = phrasesInput.split(",\\s");
        String[] events = eventsInput.split(",\\s");
        String[] authors = authorsInput.split(",\\s");
        String[] cities = citiesInput.split(",\\s");

        int n = Integer.parseInt(scanner.nextLine());

        Random random = new Random();

        for (int i = 1; i <= n; i++) {
            int randomIndexPhrase = random.nextInt(phrases.length);
            int randomIndexEvents = random.nextInt(events.length);
            int randomIndexAuthors = random.nextInt(authors.length);
            int randomIndexCities = random.nextInt(cities.length);

            System.out.printf("%s %s %s - %s%n", phrases[randomIndexPhrase], events[randomIndexEvents], authors[randomIndexAuthors], cities[randomIndexCities]);
        }
    }
}
