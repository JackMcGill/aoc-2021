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

    private int partsPerLine() {
        String[] split = lines.get(0).split(" ");
        if (split.length < 2) {
            split = lines.get(0).split("");
        }
        return split.length;
    }

    public ArrayList<String> getColumns() {
        ArrayList<String> columns = new ArrayList<>();

        for (int i = 0; i < partsPerLine(); i++) {
            StringBuilder col = new StringBuilder();
            for (String part : getColumn(i)) {
                col.append(part);
                col.append(" ");
            }
            String items = col.substring(0, col.length() - 1);

            columns.add(items);
        }
        return columns;
    }

    private ArrayList<String> getColumn(int column) {
        ArrayList<String> col = new ArrayList<>();
        for (String line : lines) {
            String[] split = line.split(" ");
            if (split.length < 2) {
                split = line.split("");
            }
            col.add(split[column]);
        }
        return col;
    }
}
