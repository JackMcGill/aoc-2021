package day_01;

import shared.AdventOfCodeDay;
import shared.FileHelper;

import java.util.ArrayList;

public class Day01 implements AdventOfCodeDay {
    ArrayList<Integer> input;

    @Override
    public void run() {
        System.out.println("Day 01");
        readFile();
        partOne();
        partTwo();
        System.out.println("\n");
    }

    private void readFile() {
        FileHelper helper = new FileHelper("src/day_01/input.txt");
        this.input = helper.getLinesAsInts();
    }

    private void partOne() {
        int count = 0;
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i + 1) > input.get(i)) {
                count += 1;
            }
        }
        System.out.println("Part 1: " + count);
    }

    private void partTwo() {
        int count = 0;
        for (int i = 0; i < input.size() - 3; i++) {
            int window1 = input.get(i) + input.get(i + 1) + input.get(i + 2);
            int window2 = input.get(i + 1) + input.get(i + 2) + input.get(i + 3);

            if (window2 > window1) {
                count += 1;
            }
        }
        System.out.println("Part 2: " + count);
    }
}
