package edu.unir.dlinked.model;

import edu.unir.dlinked.model.gateway.ListGateway;

public class DoubleLinkedList implements ListGateway {
    private Node head;
    private Integer count;

    public DoubleLinkedList() {
        this.head = null;
        this.count = 0;
    }

    @Override
    public Integer length() {
        return count;
    }

    @Override
    public String getValueAt(Integer position) throws IndexOutOfBoundsException {
        if (position >= count || position < 0) {
            throw new IndexOutOfBoundsException("La posición que estas buscando está fuera de rango");
        }

        var node = head;

        while (node != null) {
            if (node.getIndex() != position) {
                node = node.getNext();
            }
        }

        return node.getValue();
    }

    @Override
    public Integer find(String value) {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public void put(String value) {
        var node = head;
        var counter = 0;

        while (node.getNext() != null) {
            node = node.getNext();
            counter++;
        }

        node.setNext(new Node(node, null, counter, value));
    }

    @Override
    public void delete(String value) {

    }

    @Override
    public void deleteAt(Integer position) {

    }

    @Override
    public void concat(ListGateway list) {

    }

    @Override
    public void replace(String value, String replacement) {

    }
}
