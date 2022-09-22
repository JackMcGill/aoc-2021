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

}
