package File;

import java.io.FileNotFoundException;
import java.util.Map;

/**
 * @author Dmitriy
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String textPath = "src/main/java/File/text.txt";
        FileOptions fileOptions = new FileOptions(textPath);
        TextOptions textOptions = new TextOptions(fileOptions.getTextAsString());
        textOptions.parseWords();
        System.out.println("Unsorted words:");
        textOptions.printWords();
        textOptions.sortWords();
        System.out.println("\nSorted words:");
        textOptions.printWords();

        Map<String, Integer> statistics = textOptions.getWordsStatistic();

        System.out.println("\nWords statistics");
        textOptions.printWordsStatistic(statistics);

        System.out.println("\nMax repeated word is: ");
        textOptions.fidnMaxRepeatedWord(statistics);

    }
}
