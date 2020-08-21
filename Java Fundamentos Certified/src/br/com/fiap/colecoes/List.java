package br.com.fiap.colecoes;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        // Creating a ArrayList
        // add()
        ArrayList lista = new ArrayList();
        lista.add("LTP");
        lista.add("Web");
        lista.add("Algoritmos");
        System.out.println(lista);

        // set()
        ArrayList lista2 = new ArrayList();
        lista2.add("LTP");
        lista2.add("Web");
        lista2.set(1, "Algoritmos");
        System.out.println("\n" + lista2);

        // remove()
        lista.remove(2);
        System.out.println("\n" + lista);

        // get()
        System.out.println("\n" + lista2.get(1));

        // size()
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // indexOf e lastIndexOf
        int indice = lista.indexOf("Web");

        System.out.println("\nO valor \"Web\" está na posição: " + indice);

    }

}
