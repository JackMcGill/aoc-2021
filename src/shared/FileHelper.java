package shared;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
    private final String path;

    private final ArrayList<String> lines;

    public FileHelper(String path) {
        this.path = path;
        lines = makeArrayList();
    }

    private ArrayList<String> makeArrayList() {
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
        return input;
    }

    public ArrayList<String> getLines() {
        return this.lines;
    }

    public ArrayList<Integer> getLinesAsInts() {
        ArrayList<Integer> ints = new ArrayList<>();
        for (String line : lines) {
            ints.add(Integer.parseInt(line));
        }
        return ints;
    }

    public int getLineCount() {
        return lines.size();
    }
}
