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
        FileHelper helper = new FileHelper("src/day_03/test.txt");
        input = helper.getColumns();
    }

    private void partOne() {
        System.out.println("Part one: ");

    }

    private void partTwo() {
        System.out.println("Part two: ");
    }
}
