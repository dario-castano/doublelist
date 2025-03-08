package edu.unir.dlinked.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node {
    private Node previous;
    private Node next;
    private Integer index;
    private String value;
}
