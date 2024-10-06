public class Trie {
    Node root;

    public Trie(){
        root = new Node();
    }

    public void insert(String s){
        insertRecurse(root, s, 0);
    }

    public void insertRecurse(Node node, String word, int depth){
        if (depth == word.length()){
            node.setWord();
            return;
        }

        if (node.next[word.charAt(depth)] == null) {
            node.next[word.charAt(depth)] = new Node();
        }

        // Recursive call
        insertRecurse(node.next[word.charAt(depth)], word, depth + 1);
    }

    public boolean lookup(String s){
        Node current = root;

        // Iterate through each character in the string
        for (char character : s.toCharArray()) {

            // Check if the next character exists in the Trie
            if (current.next[character] == null){
                return false;
            }

            // Move the current pointer to the  existing node for the next character
            current = current.next[character];
        }

        // Return true if the word exists
        return current.isWord;
    }

    public void printTrie(){

    }
}
