package day_02;

import shared.AdventOfCodeDay;
import shared.FileHelper;

import java.util.ArrayList;

public class Day02 implements AdventOfCodeDay {
    ArrayList<String> input = new ArrayList<>();

    @Override
    public void run() {
        System.out.println("Day 02");
        readFile();
        partOne();
        partTwo();
        System.out.println("\n");
    }

    private void readFile() {
        FileHelper fileHelper = new FileHelper("src/day_02/input.txt");
        input = fileHelper.getLines();
    }

    private void partOne() {
        int horizontalPosition = 0;
        int depth = 0;

        for (String line : input) {
            String[] vector = line.split(" ");
            switch (vector[0]) {
                case "forward" -> horizontalPosition += Integer.parseInt(vector[1]);
                case "down" -> depth += Integer.parseInt(vector[1]);
                case "up" -> depth -= Integer.parseInt(vector[1]);
            }
        }
        System.out.println("Part 1: " + horizontalPosition * depth);
    }

    private void partTwo() {
        int horizontalPosition = 0;
        int depth = 0;
        int aim = 0;

        for (String line : input) {
            String[] vector = line.split(" ");
            switch (vector[0]) {
                case "forward" -> {
                    horizontalPosition += Integer.parseInt(vector[1]);
                    depth += (aim * Integer.parseInt(vector[1]));
                }
                case "down" -> aim += Integer.parseInt(vector[1]);
                case "up" -> aim -= Integer.parseInt(vector[1]);
            }
        }
        System.out.println("Part 2: " + horizontalPosition * depth);
    }
}
