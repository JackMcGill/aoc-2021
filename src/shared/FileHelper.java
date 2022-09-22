package shared;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
    private final String path;
    private int lines;

    public FileHelper(String path) {
        this.path = path;
    }

    public ArrayList<Integer> getIntArrayList() {
        ArrayList<Integer> input = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);
            while (reader.hasNextInt()) {
                input.add(reader.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
        countLines(input);
        return input;
    }

    public ArrayList<String> getStringArrayList() {
        ArrayList<String> input = new ArrayList<>();
        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                input.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file");
        }
        countLines(input);
        return input;
    }

    private void countLines(ArrayList<?> input) {
        lines = input.size();
    }
}
