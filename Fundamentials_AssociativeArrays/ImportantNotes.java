package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class ImportantNotes {
    public static void main(String[] args) {

        HashMap<String, Integer> airplanes = new HashMap<>();
        airplanes.put("Boeing 737", 130);
        airplanes.put("Airbus A320", 150);

        airplanes.put("Boeing 737", 130);
        airplanes.remove("Boeing 737");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Airbus A320", 150);

        if (map.containsKey("Airbus A320"))
            System.out.println("Airbus A320 key exists");

        map.put("Airbus A320", 150);
        System.out.println(map.containsValue(150)); //true
        System.out.println(map.containsValue(100)); //false

        //Iterating Through Map
        Map<String, Double> fruits = new LinkedHashMap<>();
        fruits.put("banana", 2.20);
        fruits.put("kiwi", 4.50);
        for (Map.Entry<String, Double> entry : fruits.entrySet()) {
            System.out.printf("%s -> %.2f%n",
                    entry.getKey(), entry.getValue());

        }

        //Collections of Key And Value Pairs
        // Hashmap
        // LinkedHashMap -> keeps keys in order of addition
        //TreeMap -> keys always sorted


        // Arrays with Stream API
        int min = Arrays.stream(new int[]{15, 25, 35}).min().getAsInt();
        int min1 = Arrays.stream(new int[]{15, 25, 35}).min().orElse(2);
        int min2 = Arrays.stream(new int[]{}).min().orElse(2); // 2
        int max = Arrays.stream(new int[]{15, 25, 35}).max().getAsInt();
        int sum = Arrays.stream(new int[]{15, 25, 35}).sum();
        double avg = Arrays.stream(new int[]{15, 25, 35})
                .average().getAsDouble();

        // Collections with Stream API
        ArrayList<Integer> nums = new ArrayList<>() {{
            add(15); add(25); add(35);
        }};
        int min3 = nums.stream().mapToInt(Integer::intValue)
                .min().getAsInt();
        int min4 = nums.stream()
                .min(Integer::compareTo).get();
        int max1 = nums.stream().mapToInt(Integer::intValue)
                .max().getAsInt();
        int max2 = nums.stream()
                .max(Integer::compareTo).get();
        int sum1 = nums.stream()
                .mapToInt(Integer::intValue).sum();
        double avg1 = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        // Manipulating Collections
        Scanner scanner = new Scanner(System.in);
        int[] nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String[] words = {"abc", "def", "geh", "yyy"};
        words = Arrays.stream(words)
                .map(w -> w + "yyy")
                .toArray(String[]::new);
        //abcyyy, defyyy, gehyyy, yyyyyy


        // Converting Collections
        int[] nums2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        List<Integer> nums3 = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        // Filtering Collections
        int[] nums4 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .filter(n -> n > 0)
                .toArray();

        //Sorting Collections
//        nums4 = nums4.stream()
//                .sorted((n1, n2) -> n1.compareTo(n2))
//                .collect(Collectors.toList());
//
//        nums4 = nums4.stream()
//                .sorted((n1, n2) -> n2.compareTo(n1))
//                .collect(Collectors.toList());

        //Sorting Collections by Multiple Criteria
        Map<Integer, String> products = new HashMap<>();
        products.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int res = e2.getValue().compareTo(e1.getValue());
                    if (res == 0)
                        res = e1.getKey().compareTo(e2.getKey());
                    return res; })
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        //Using Functional ForEach
        Map<String, ArrayList<Integer>> arr = new HashMap<>();
        arr.entrySet().stream()
                .sorted((a, b) -> {
                    if (a.getKey().compareTo(b.getKey()) == 0) {
                        int sumFirst = a.getValue().stream().mapToInt(x -> x).sum();
                        int sumSecond = b.getValue().stream().mapToInt(x -> x).sum();
                        return sumFirst - sumSecond;
                    }
                    return b.getKey().compareTo(a.getKey());
                })
                .forEach(pair -> {
                    System.out.println("Key: " + pair.getKey());
                    System.out.print("Value: ");
                    pair.getValue().sort((a, b) -> a.compareTo(b));
                    for (int num : pair.getValue()) {
                        System.out.printf("%d ", num);
                    }
                    System.out.println();
                });



    }
}
