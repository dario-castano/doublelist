package edu.unir.dlinked.model;

public class Node {
    private Node previous;
    private Node next;
    private Integer index;
    private String value;

    public Node(Node previous, Node next, Integer index, String value) {
        this.previous = previous;
        this.next = next;
        this.index = index;
        this.value = value;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public Node getNext() {
        return this.next;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getValue() {
        return this.value;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String toString() {
        return "Node(previous=" + this.getPrevious() + ", next=" + this.getNext() + ", index=" + this.getIndex() + ", value=" + this.getValue() + ")";
    }
}
