package edu.unir.dlinked.model.gateway;

public interface ListGateway {
    Integer length();
    String getValueAt(Integer position);
    Integer find(String value);
    void print();
    void put(String value);
    void delete(String value);
    void deleteAt(Integer position);
    void concat(ListGateway list);
    void replace(String value, String replacement);
}
