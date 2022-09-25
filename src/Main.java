import day_01.Day01;
import day_02.Day02;
import day_03.Day03;
import shared.AdventOfCodeDay;

import java.util.ArrayList;

public class Main {
    public static final ArrayList<AdventOfCodeDay> days = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Advent of Code\n");
        AdventOfCodeDay day01 = new Day01();
        AdventOfCodeDay day02 = new Day02();
        AdventOfCodeDay day03 = new Day03();

        days.add(day01);
        days.add(day02);
        days.add(day03);

        play();
    }

    private static void play() {
        for (AdventOfCodeDay day : days) {
            day.run();
        }
    }
}
