package day_02;

import shared.Day;
import shared.FileHelper;

import java.util.ArrayList;

public class Day02 implements Day {
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
        FileHelper fileHelper = new FileHelper("src/day_02/test.txt");
        input = fileHelper.getStringArrayList();
    }

    private void partOne() {
        for (String line : input) {
            String c = line.substring(0,1);
            System.out.println(c);
        }
    }

    private void partTwo() {

    }
}
