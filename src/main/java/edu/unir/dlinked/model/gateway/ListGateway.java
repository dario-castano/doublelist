package edu.unir.dlinked.model.gateway;

public interface ListGateway {
    public Integer length();
    public String getValueAt(Integer position);
    public Integer find(String value);
    public void print();
    public void put(String value);
    public void delete(String value);
    public void deleteAt(Integer position);
    public void concat(ListGateway list);
    public void replace(String value, String replacement);
}
