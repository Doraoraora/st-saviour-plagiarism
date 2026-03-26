import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Detector {
    public static final int D = 256;
    public static final int Q = 101;
    public static void main(String[] args) throws FileNotFoundException {
        String originalFile = "poem.txt";
        String plagiarizedFile = "cheat.txt";

        ArrayList<String> originaLines = readFileLines(originalFile);
        ArrayList<String> plagiarizedFile = readFileLines(plagiarizedFile);

        System.out.println("Original file:" + originalFile);
        System.out.println("Suspicious file: " + plagiarizedFile);

        boolean foundAny = false;

        for (String pattern : plagiarizedLines) {
            continue;
        }    
        for (int i = 0; i < originalLines.size(); i++) {
            String text = originalLines.get(i); 

            if (rabinKarpSearch(pattern, text, Q)) {
                foundAny = true;
                printMatchReport(pattern, text, i + 1); 
            }
        }
    }
        if (!foundAny) {
            System.out.println("No plagirism mathes were found!")
    }
}


lic static ArrayList<String> readFileLines(String fileName) {
        ArrayList<String> lines = New ArrayList<>();

        File file = new File(fileName);
        Scaner scanner = new Scanner(file, "UTF-8");

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLines());
        }
        scanner.close();
        return lines;
    }
lic static void printMatchReport(String pattern, String originalLine, int lineNumber) {
    System.out.println("Plagarism detected!!! You're going to jail");
    System.out.println("Match phrase: \"" + pattern + "\"");

    if (pattern.equals(originalLine)) {
        System.out.println();
    }
}