package Fundamentals.Fundamentials_AssociativeArrays;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class E09ForceBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> forceData = new LinkedHashMap<>();
        String input = scanner.nextLine();
        boolean userToAdd = false;
        boolean userToUpdate = false;

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                userToAdd = true;
            } else if (input.contains("->")) {
                userToUpdate = true;
            }
            if (userToAdd) {
                String user = input.split("\\s+\\|\\s+")[1];
                String side = input.split("\\s+\\|\\s+")[0];
                addToForceData(forceData, side, user);
            }
            if (userToUpdate) {
                String user = input.split("\\s+->\\s+")[0];
                String side = input.split("\\s+->\\s+")[1];
                updateForceData(forceData, side, user);
            }
            userToAdd = false;
            userToUpdate = false;
            input = scanner.nextLine();
        }
        forceData.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sortedResult = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (sortedResult == 0) {
                        sortedResult = e1.getKey().compareTo(e2.getKey());
                    }
                    return sortedResult;
                }).forEach(e -> {
            System.out.println("Side: " + e.getKey() + ", Members: " + e.getValue().size());
            e.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
        });
    }

    private static void updateForceData(Map<String, List<String>> forceData, String side, String user) {
        forceData.entrySet().forEach(entry -> entry.getValue().remove(user));
        //проверка дали я има страната
        //ако я няма -> създаваме
        if (!forceData.containsKey(side)) {
            forceData.put(side, new ArrayList<>());
        }
        forceData.putIfAbsent(side, new ArrayList<>());
        //ако я има -> към списъка добавяме user
        forceData.get(side).add(user);
        System.out.printf("%s joins the %s side!%n", user, side);
    }

    private static void addToForceData(Map<String, List<String>> forceData, String side, String user) {
        forceData.putIfAbsent(side, new ArrayList<>());
        //проверка дали user-a го има
        //ако го няма -> трябва да го добавим към новата страна
        boolean isExist = false;
        for (List<String> list : forceData.values()) {
            if (list.contains(user)) {
                isExist = true;
            }
        }
        if (!isExist) {
            //forceUser добавяме го в forceSide
            forceData.get(side).add(user);
        }
    }


}
