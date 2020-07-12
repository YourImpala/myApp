package File;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dmitriy
 * @see #parseWords()
 * @see #printWords()
 * @see #sortWords()
 * @see #getWordsStatistic()
 * @see #printWordsStatistic(Map)
 * @see #getMaxRepeats(Map) 
 * @see #printMaxRepeatedWords(Map, int) 
 */
public class TextOptions {
    private final String text;
    private final ArrayList<String> words;

    /**
     *  init String text and ArrayList container for words
     * @param text
     */
    TextOptions(String text) {
        this.text = text;
        this.words = new ArrayList<>();
    }

    /**
     * parse words from text string
     */
    public void parseWords() {
        for (String word: text.split("\\s+")) {
           this.words.add(word);
       }
    }

    /**
     * print words to console
     */
    public void printWords() {
        if(this.words.size() == 0) {
            System.out.println("No words here, you have to parse it from string. Use parseWords() method.");
            return;
        }
        for (String word: this.words) {
            System.out.println(word);
        }
    }

    /**
     * sorting words in place
     */
    public void sortWords() {
        Collections.sort(this.words);
    }

    /**
     * count words repeats and return it in object
     * @return words and words counter value
     */
    public Map<String, Integer> getWordsStatistic() {
        Map<String, Integer> map = new HashMap<>();
        for (String word: this.words) {
            if (map.containsKey(word)) {
                map.put(word, (map.get(word) + 1));
            } else {
                map.put(word, 1);
            }
        }

        return map;
    }

    /**
     * print words statistic to console
     * @param statistics statistics map object Map<String word, Integer count value>
     */
    public void printWordsStatistic(Map<String, Integer> statistics) {
        for (Map.Entry<String, Integer> el : statistics.entrySet()) {
            System.out.println(el.getKey() + " : "+ el.getValue());
        }
    }

    /**
     *
     * @param statistics statistics map object Map<String word, Integer count value>
     * @return max count value of  repeated word
     */
    public int getMaxRepeats(Map<String, Integer> statistics) {
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> el : statistics.entrySet()) {
            if (maxEntry == null || el.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = el;
            }
        }
        return maxEntry.getValue();
    }

    /**
     * print words with max counter value
     * @param statistics statistics map object Map<String word, Integer count value>
     */
    public void printMaxRepeatedWords(Map<String, Integer> statistics, int maxRepeats) {
        for (Map.Entry<String, Integer> el : statistics.entrySet()) {
            if (el.getValue() == maxRepeats) {
                System.out.println(el.getKey() + " : " + el.getValue());
            }
        }
    }

}
