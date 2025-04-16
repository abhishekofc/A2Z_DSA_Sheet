
// This code is for Tree Construction in java .....

class Node {
    int data;        // Stores the value of the node
    Node left;      // Reference to the left child node
    Node right;     // Reference to the right child node


    // Constructor to initialize  a node with a given key
    public Node(int key) {
        data = key;      // Assigns the provided key to  the data field of the node
        left = null;     // Initializes left child reference as null
        right = null;    // Initializes right child reference as null
    }
}

public class TreeRepr {
    public static void main(String[] args) {
         
        Node root = new Node(1);                                // Creates the root node with a key value of 1
        root.left = new Node(2);                                // Creates a left child node for the root with a key value of 2
        root.right = new Node(3);                               // Creates a right child node for the root with a key value of 3
        root.right.left = new Node(5);                          // Creates a left child node for the right child of the root with a key value of 5
    }
}

