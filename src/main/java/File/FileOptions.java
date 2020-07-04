package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Dmitriy
 * @see #getTextAsString()
 */
public class FileOptions {
    private final String path;

    /**
     * init path to file
     * @param path path to text file
     */
    FileOptions(String path) {
        this.path = path;
    }

    /**
     * Get text from file and return it as string
     * @return string that contains text from file
     * @throws FileNotFoundException if file not found
     */
    public String getTextAsString() throws FileNotFoundException {
        String textAsString = null;

        try {
            File file = new File(this.path);
            Scanner scanner = new Scanner(file);
            textAsString = scanner.useDelimiter("\\A").next().trim();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No words in file.");
            e.printStackTrace();
        }
        return textAsString;
    }
}
