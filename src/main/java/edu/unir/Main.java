package edu.unir;

import edu.unir.dlinked.model.DoubleLinkedList;
import edu.unir.mercado.ListaMercado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Inicializar la lista de mercado con una DoubleLinkedList
        ListaMercado mercado = new ListaMercado(new DoubleLinkedList());

        // Probar agregar elementos a la lista
        System.out.println("Agregando elementos a la lista...");
        mercado.getProductos().put("Manzanas");
        mercado.getProductos().put("Plátanos");
        mercado.getProductos().put("Naranjas");
        mercado.getProductos().put("Uvas");
        System.out.print("Lista después de agregar elementos: ");
        mercado.getProductos().print(); // Imprimir la lista

        // Probar obtener la longitud de la lista
        System.out.println("\nLongitud de la lista: " + mercado.getProductos().length());

        // Probar obtener un valor en una posición específica
        try {
            System.out.println("\nValor en la posición 2: " + mercado.getProductos().getValueAt(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probar encontrar el índice de un valor específico
        System.out.println("\nÍndice de 'Plátanos': " + mercado.getProductos().find("Plátanos"));

        // Probar eliminar un elemento por valor
        System.out.println("\nEliminando 'Plátanos'...");
        mercado.getProductos().delete("Plátanos");
        System.out.print("Lista después de eliminar 'Plátanos': ");
        mercado.getProductos().print();

        // Probar eliminar un elemento en una posición específica
        System.out.println("\nEliminando elemento en la posición 1...");
        mercado.getProductos().deleteAt(1);
        System.out.print("Lista después de eliminar el elemento en la posición 1: ");
        mercado.getProductos().print();

        // Probar reemplazar un elemento
        System.out.println("\nReemplazando 'Uvas' con 'Fresas'...");
        mercado.getProductos().replace("Uvas", "Fresas");
        System.out.print("Lista después de reemplazar 'Uvas' con 'Fresas': ");
        mercado.getProductos().print();

        // Probar concatenar otra lista
        System.out.println("\nConcatenando otra lista...");
        DoubleLinkedList otraLista = new DoubleLinkedList();
        otraLista.put("Mangos");
        otraLista.put("Piñas");
        mercado.getProductos().concat(otraLista);
        System.out.print("Lista después de la concatenación: ");
        mercado.getProductos().print();

        // Longitud final de la lista
        System.out.println("\nLongitud final de la lista: " + mercado.getProductos().length());
    }
}