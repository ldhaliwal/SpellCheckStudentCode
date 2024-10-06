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

        // TST solution:

        // Create a TST for the dictionary
        TST dict_trie = new TST();

        for (String word : dictionary) {
            dict_trie.insertHelper(word);
        }

        // Create a TST for the misspelled words
        TST misspelledWords = new TST();
        ArrayList<String> finalMisspelledWords = new ArrayList<>();

        // for each word in text:
        for (String word: text) {
            // if not in dictionary TST and not in misspelled TST, add the word to misspelled TST
            if (!dict_trie.lookupHelper(word) && !misspelledWords.lookupHelper(word)) {
                misspelledWords.insertHelper(word);
                finalMisspelledWords.add(word);
            }
        }
        // Convert it back to an array
        // return the array
        System.out.println(finalMisspelledWords.size());
        String[] misspelled = finalMisspelledWords.toArray(new String[0]);
        return misspelled;



        // Trie solution:
//        // Create a trie representation of the dictionary and add each word in the dictionary to it
//        Trie dict = new Trie();
//        for (String word : dictionary){
//            dict.insert(word);
//        }
//
//        // Create a trie for easier misspelled word lookup
//        Trie misspelledWords = new Trie();
//        ArrayList<String> finalMisspelledWords = new ArrayList<>();
//
//
//        // Go through each word in the text, and if it isn't in the dictionary
//        // and not in the list of misspelled words, add it to the list
//        for (String word : text){
//            if(!dict.lookup(word) && !misspelledWords.lookup(word)){
//                misspelledWords.insert(word);
//                finalMisspelledWords.add(word);
//            }
//        }
//
//        // Convert back to an array and return the misspelled words
//        System.out.println(finalMisspelledWords.size());
//        String[] misspelled = finalMisspelledWords.toArray(new String[0]);
//        return misspelled;
    }
}
