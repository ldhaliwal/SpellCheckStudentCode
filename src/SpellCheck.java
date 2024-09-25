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
            // if a word does not start with the root of any existing cluster (or there are no clusters)
                //make it the root of a new cluster
            //else
                // cycle through each root of a cluster until the word contains the root
                // follow the edges down until the end of a path or there are no other nodes that work to go down
                // add the word there

        //condense the inputted text into single instances of words
            // for string word in text
                // if word not in condensed text, add into new array



        return null;
    }
}
