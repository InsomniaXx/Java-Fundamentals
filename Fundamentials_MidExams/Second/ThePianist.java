package Fundamentals.Fundamentials_MidExams.Second;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> pieceComposer = new TreeMap<>();
        Map<String, String> pieceKey = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] nextPiece = scanner.nextLine().split("\\|");
            String piece = nextPiece[0];
            String composer = nextPiece[1];
            String key = nextPiece[2];

            pieceComposer.put(piece, composer);
            pieceKey.put(piece, key);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] nextCommand = command.split("\\|");
            String action = nextCommand[0];
            String pieceName = nextCommand[1];

            switch (action) {
                case "Add":
                    String newComposer = nextCommand[2];
                    String newKey = nextCommand[3];
                    addPiece(pieceComposer, pieceKey, pieceName, newComposer, newKey);
                    break;
                case "Remove":
                    removePiece(pieceComposer, pieceKey, pieceName);
                    break;
                case "ChangeKey":
                    String updateKey = nextCommand[2];
                    changeKey(pieceKey, pieceName, updateKey);
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, String> element : pieceComposer.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", element.getKey(), element.getValue(), pieceKey.get(element.getKey()));
        }
    }

    private static void changeKey(Map<String, String> pieceKey, String pieceName, String updateKey) {
        if (pieceKey.containsKey(pieceName)) {
            pieceKey.put(pieceName, updateKey);
            System.out.printf("Changed the key of %s to %s!%n", pieceName, updateKey);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
        }
    }

    private static void removePiece(Map<String, String> pieceComposer, Map<String, String> pieceKey, String pieceName) {
        if (pieceComposer.containsKey(pieceName)) {
            pieceComposer.remove(pieceName);
            pieceKey.remove(pieceName);
            System.out.printf("Successfully removed %s!%n", pieceName);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
        }
    }

    private static void addPiece(Map<String, String> pieceComposer, Map<String, String> pieceKey, String pieceName, String newComposer, String newKey) {
        if (!pieceComposer.containsKey(pieceName)) {
            pieceComposer.put(pieceName, newComposer);
            pieceKey.put(pieceName, newKey);
            System.out.printf("%s by %s in %s added to the collection!%n", pieceName, newComposer, newKey);
        } else {
            System.out.printf("%s is already in the collection!%n", pieceName);
        }
    }
}
