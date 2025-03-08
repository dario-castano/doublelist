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

        Node node = head;
        while (node != null && !node.getIndex().equals(position)) {
            node = node.getNext();
        }

        if (node == null) {
            throw new IndexOutOfBoundsException("Node not found at position: " + position);
        }

        return node.getValue();
    }

    @Override
    public Integer find(String value) {
        Node node = head;
        while (node != null) {
            if (node.getValue().equals(value)) {
                return node.getIndex();
            }
            node = node.getNext();
        }
        return -1;
    }

    @Override
    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    @Override
    public void put(String value) {
        if (head == null) {
            head = new Node(null, null, 0, value);
        } else {
            Node node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new Node(node, null, count, value));
        }
        count++;
    }

    @Override
    public void delete(String value) {
        Node node = head;
        while (node != null) {
            if (node.getValue().equals(value)) {
                if (node.getPrevious() != null) {
                    node.getPrevious().setNext(node.getNext());
                } else {
                    head = node.getNext();
                }
                if (node.getNext() != null) {
                    node.getNext().setPrevious(node.getPrevious());
                }
                count--;
                return;
            }
            node = node.getNext();
        }
    }

    @Override
    public void deleteAt(Integer position) {
        if (position >= count || position < 0) {
            throw new IndexOutOfBoundsException("La posición que estas buscando está fuera de rango");
        }

        Node node = head;
        while (node != null && !node.getIndex().equals(position)) {
            node = node.getNext();
        }

        if (node != null) {
            if (node.getPrevious() != null) {
                node.getPrevious().setNext(node.getNext());
            } else {
                head = node.getNext();
            }
            if (node.getNext() != null) {
                node.getNext().setPrevious(node.getPrevious());
            }
            count--;
        }
    }

    @Override
    public void concat(ListGateway list) {
        if (list == null || list.length() == 0) {
            return;
        }

        Node lastNode = head;
        while (lastNode != null && lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }

        // Append the new list
        for (int i = 0; i < list.length(); i++) {
            String value = list.getValueAt(i);
            if (lastNode == null) {
                head = new Node(null, null, count, value);
                lastNode = head;
            } else {
                lastNode.setNext(new Node(lastNode, null, count, value));
                lastNode = lastNode.getNext();
            }
            count++;
        }
    }

    @Override
    public void replace(String value, String replacement) {
        Node node = head;
        while (node != null) {
            if (node.getValue().equals(value)) {
                node.setValue(replacement);
                return;
            }
            node = node.getNext();
        }
    }
}
