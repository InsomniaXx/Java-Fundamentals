package Fundamentals.Fundamentials_TextProcessing;

import java.util.Date;

public class ImportantNotes {
    public static void main(String[] args) {

        //concat()
        String greet = "Hello, ";
        String name = "John";
        String result = greet.concat(name);
        System.out.println(result); // "Hello, John"

        //String.join("", …)
        String t = String.join("", "con", "ca", "ten", "ate");
        // "concatenate"
        String p = String.join(", ", "con", "ca", "ten", "ate");
        // "con, ca, ten, ate"
        String s = "abc";
        String[] arr = new String[3];
        for (int i = 0; i < arr.length; i++) { arr[i] = s; }
        String repeated = String.join("", arr); // "abcabcabc"

        //Substring
        //substring(int startIndex, int endIndex)
        // Връща стринг със стартов индекс и краен индекс
        String card = "10C";
        String power = card.substring(0, 2);
        System.out.println(power); // 10

        //substring(int startIndex)
        //Връща стринг със стартов индекс до края
        String text = "My name is John";
        String extractWord = text.substring(11);
        System.out.println(extractWord); // John

        //Searching
        //indexOf() - returns the first match index or -1
        String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.indexOf("banana"));    // 0
        System.out.println(fruits.indexOf("orange"));    // -1

        //lastIndexOf() - finds the last occurrence
        //String fruits = "banana, apple, kiwi, banana, apple";
        System.out.println(fruits.lastIndexOf("banana")); // 21
        System.out.println(fruits.lastIndexOf("orange")); // -1

        //contains() - checks whether one string contains another
        //String text = "I love fruits.";
        System.out.println(text.contains("fruits"));// true
        System.out.println(text.contains("banana")); // false

        //Split by multiple separators
        String text1 = "Hello, I am John.";
        String[] words = text1.split("[, .]+");
        // "Hello", "I", "am", "John"

        //replace(match, replacement) - replaces all occurrences
        String text2 = "Hello, john@softuni.bg, you have been using john@softuni.bg in your registration.";
        String replacedText = text2
                .replace("john@softuni.bg", "john@softuni.com");
        System.out.println(replacedText);
        // Hello, john@softuni.com, you have been using john@softuni.com in your registration.

        //Use the StringBuilder to build/modify strings
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append("John! ");
        sb.append("I sent you an email.");
        System.out.println(sb.toString());
        // Hello, John! I sent you an email.

        System.out.println(new Date());
        StringBuilder textT = new StringBuilder();
        for (int i = 0; i < 1000000; i++)
            textT.append("a");
        System.out.println(new Date());

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello Peter, how are you?");
        System.out.println(sb1.charAt(1)); // e

        sb.insert(11, " Ivanov");
        System.out.println(sb);
        // Hello Peter Ivanov, how are you?

        sb.append("Hello Peter, how are you?");
        sb.replace(6, 11, "George");

        String text3 = sb.toString();
        System.out.println(text3);
        // Hello George, how are you?

        //setLength(0) - removes all characters

        //Character.isDigit(char symbol)

    }
}
