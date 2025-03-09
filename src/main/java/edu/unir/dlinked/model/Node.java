package edu.unir.dlinked.model;

import lombok.*;

@Data
@AllArgsConstructor
public class Node {
    private Node previous;
    private Node next;
    private Integer index;
    private String value;
}
