package datastructure;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
public class TextAnalyzer {

    /* Determine the most repeated word in given string
     *  Rules:
     *     - The word is defined as something separated by spaces without punctuation included.
     *       list of possible punctuations: "\\n\\t\\r.,;:!?()"
     *     - The uppercase and lowercase version of a word should be counted as same
     *     - If two words are repeated an equal number of times, whichever came first should be returned.
     *     - Take out common words so they don't count as part of the repetition
     *       List of common words: {"the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", "was", "were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "all"}
     */

    private static String DELIMITERS = "[^a-zA-Z]";
    private WordInfo wordInfo;

    private List<String> commonWords;
    private Map<String, Integer> wordsMap;

    TextAnalyzer() {
        String[] commons = {"the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", "was", "were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "all"};
        this.commonWords = Arrays.asList(commons);
    }

    private void countOccurrences(String word) {
        String trimmedWord = word.trim().toLowerCase();
        if (!trimmedWord.isEmpty() && !commonWords.contains(trimmedWord)) {
            if (wordsMap.containsKey(trimmedWord)) {
                wordsMap.put(trimmedWord, wordsMap.get(trimmedWord) + 1);
            } else {
                wordsMap.put(trimmedWord, 1);
            }
        }
    }

    WordInfo findMostRepeatedWord(String input) {
        wordsMap = new LinkedHashMap<>();
        String maxUsedWord = "";
        int maxUsedWordOccurrences = 0;

        Arrays.stream(input.split(DELIMITERS)).forEach(this::countOccurrences);

        for (String word : wordsMap.keySet()) {
            Integer occurrences = wordsMap.get(word);
            if (occurrences > maxUsedWordOccurrences) {
                maxUsedWord = word;
                maxUsedWordOccurrences = occurrences;
            }
        }
        System.out.println("Word " + maxUsedWord + " used " + maxUsedWordOccurrences + " times.");

        return new WordInfo(maxUsedWord, maxUsedWordOccurrences);
    }
}
