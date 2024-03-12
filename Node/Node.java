package javaoop.Node;

public class Node {

    protected Integer value;
    protected Node left;
    protected Node right;
    public Node(Integer value) {
        this.value = value;
    }

    public static void main(String[] args) {

        Node node = new Node(10);
        node.addValue(4);
        node.addValue(5);
        node.addValue(10);
        node.addValue(8);
        node.find(7);
    }

    public void addValue(Integer intero) {
        if (intero <= value) {
            if (left == null) {
                left = new Node(intero);
            } else {
                left.addValue(intero);
            }
        } else if (intero > value) {
            if (right == null) {
                right = new Node(intero);
            } else {
                right.addValue(intero);
            }
        }
    }

    public void print() {
        if (left != null) {
            left.print();
        }
        System.out.println(value);
        if (right != null) {
            right.print();
        }
    }

    public void reversePrint() {
        if (right != null) {
            right.reversePrint();
        }
        System.out.println(value);
        if (left != null) {
            left.reversePrint();
        }
    }

    public void find(Integer intero) {
        // Trovato, l'intero coincide con value
        if (intero == value) {
            System.out.println("Trovato");
            return;
        }
        // Se non l'abbiamo trovato, se minore vado a sinistra
        if (intero < value) {
            recursiveFind(left, intero);
            return;
        }
        // Se è maggiore vado a destra
        if (intero > value) {
            recursiveFind(right, intero);
            return;
        }
    }

    private void recursiveFind(Node nodo, Integer intero) {
        // Se è null, non trovato
        if (nodo == null) {
            System.out.println("Valore non presente");
            return;
        }
        // Altrimenti, proseguo a sinistra
        nodo.find(intero);
        return;
    }

    public Integer getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
