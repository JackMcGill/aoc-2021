package day_03;

import shared.AdventOfCodeDay;
import shared.FileHelper;

import java.util.ArrayList;

public class Day03 implements AdventOfCodeDay {
    ArrayList<String> input = new ArrayList<>();

    @Override
    public void run() {
        System.out.println("Day 03");
        readFile();
        partOne();
        partTwo();
    }

    private void readFile() {
        FileHelper helper = new FileHelper("src/day_03/input.txt");
        input = helper.getColumns();
    }

    private void partOne() {
        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();

        for (String line : input) {
            int onesCount = 0;
            String[] split = line.split(" ");
            for (String bit : split) {
                if (Integer.parseInt(bit) == 1) {
                    onesCount++;
                }
            }
            if (onesCount > split.length / 2) {
                gamma.append("1");
                epsilon.append("0");
            } else {
                gamma.append("0");
                epsilon.append("1");
            }
        }
        int decimal = Integer.parseInt(gamma.toString(), 2) * Integer.parseInt(epsilon.toString(), 2);

        System.out.println("Part one: " + decimal);
    }

    private void partTwo() {
        System.out.println("Part two: ");
    }
}
