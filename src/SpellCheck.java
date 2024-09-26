import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Liliana Dhaliwal
 * */

public class SpellCheck {

    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {

        // make a forest of words from the dictionary (can probably be done in another method)
        HashSet<String> dictSet = new HashSet<>();
        Collections.addAll(dictSet, dictionary);

        String[] cleanedText = cleanUpText(text).toArray(new String[0]);

        ArrayList<String> misspelledWords = new ArrayList<>();
        for (String word : cleanedText) {
            if (!dictSet.contains(word) ) {
                misspelledWords.add(word); // Add to result list if misspelled and not already added.
            }
        }
        //System.out.println(Arrays.toString(misspelledWords.toArray(new String[0])));
        System.out.println(misspelledWords.size());
        return misspelledWords.toArray(new String[0]);
    }


    //condense the inputted text into single instances of words
        // for string word in text
        // if word not in condensed text, add into new array
    public ArrayList<String> cleanUpText(String[] text){
        ArrayList <String> newText = new ArrayList <String>();

        for (String word : text) {
            if (!newText.contains(word)) {
                newText.add(word);
            }
        }
        return newText;
    }
}
