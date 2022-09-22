import day_01.Day01;
import day_02.Day02;
import shared.Day;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Day> days = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Advent of Code\n");
        Day day01 = new Day01();
        Day day02 = new Day02();

        days.add(day01);
        days.add(day02);

        play();
    }

    private static void play() {
        for (Day day : days) {
            day.run();
        }
    }
}
