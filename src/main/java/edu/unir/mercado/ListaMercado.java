package edu.unir.mercado;

import edu.unir.dlinked.model.gateway.ListGateway;

public class ListaMercado {
    private final ListGateway productos;

    public ListaMercado(ListGateway productos) {
        this.productos = productos;
    }

    public ListGateway getProductos() {
        return this.productos;
    }

    public String toString() {
        return "ListaMercado(productos=" + this.getProductos() + ")";
    }
}
