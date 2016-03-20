package org.hillel.lesson14;

/**
 * Created by yuriy on 21.01.16.
 */
public class CustomTree {

    Node root;

    public void add(int key, String value) {
        Node node = new Node(key, value);

        if (root == null) {
            root = node;
            return;
        }

        Node currentNode = root;
        Node parent;

        while (true) {
            parent = currentNode;
            if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    parent.leftChild = node;
                    return;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    parent.rightChild = node;
                    return;
                }
            }
        }
    }

    public String get(int key) {
        if (root == null) {
            return null;
        }

        Node currentNode = root;
        while (true) {
            if (key == currentNode.key) {
                return currentNode.value;
            } else if (key < currentNode.key) {
                currentNode = currentNode.leftChild;
                if (currentNode == null) {
                    return null;
                }
            } else {
                currentNode = currentNode.rightChild;
                if (currentNode == null) {
                    return null;
                }
            }
        }
    }

    public void traverse(Node currentNode) {
        if (currentNode != null) {
            traverse(currentNode.leftChild);
            System.out.println(currentNode.key + " - " + currentNode.value);
            traverse(currentNode.rightChild);
        }
    }

    public static void main(String[] args) {
        CustomTree tree = new CustomTree();
        tree.add(19, "Dog");
        tree.add(5, "Cat");
        tree.add(24, "Cat");
        tree.add(4, "Duck");
        tree.add(7, "Turtle");

        tree.traverse(tree.root);

        System.out.println(tree.get(24));
        System.out.println(tree.get(4));
        System.out.println(tree.get(10));

    }

    class Node {
        int key;
        String value;
        Node leftChild;
        Node rightChild;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    ", key=" + key +
                    '}';
        }
    }
}
