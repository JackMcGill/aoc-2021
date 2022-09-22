package day_01;

import shared.Day;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day01 implements Day {
    ArrayList<Integer> input;

    @Override
    public void run() {
        readFile();
        partOne();
        partTwo();
    }

    private void readFile() {
        try {
            File file = new File("src/day_01/input.txt");
            Scanner reader = new Scanner(file);
            input = new ArrayList<>();
            while (reader.hasNextInt()) {
                input.add(reader.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
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
