package javaoop.Node;

public class Node {
    protected Integer value;
    protected Node left;
    protected Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public void addValue(Integer intero){
        if(intero < value){
            if(left == null){
                left = new Node(intero);
            } else {
                left.addValue(intero);
            }
        } else if (intero > value){
            if(right == null){
                right = new Node(intero);
            } else {
                right.addValue(intero);
            }
        }
    }

    public Integer getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
