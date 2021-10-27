package Fundamentals.Fundamentials_Objects_Classes.L04Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= numberSongs; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song(type, name, time);
            songs.add(song);
        }

        String filterType = scanner.nextLine();

        for (Song song : songs) {
            if (song.getTypeList().equals(filterType)) {
                System.out.println(song.getName());
            } else if (filterType.equals("all")){
                System.out.println(song.getName());
            }
        }
    }
}
