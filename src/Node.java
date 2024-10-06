public class Node {
    boolean isWord;
    Node[] next;

    public Node(){
        isWord = false;
        next = new Node[256];
    }

    public boolean isWord() {
        return isWord;
    }

    public void setWord(){
        isWord = true;
    }

    public Node[] getNext(){
        return next;
    }
}

