package Fundamentals.Fundamentials_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class E07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //"1 2 3 |4 5 6 |  7  8"
        List<String> list = Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(list);

        System.out.println(list.toString().replace("[", "")
                .replace("]", "")
                .replaceAll(",", "")
                .trim()
                .replaceAll("\\s+", " "));

    }
}
