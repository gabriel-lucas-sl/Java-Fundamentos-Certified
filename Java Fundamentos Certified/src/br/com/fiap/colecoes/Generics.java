package br.com.fiap.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Generics {

    public static void main(String[] args) {

        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

        Cliente cliente_1 = new Cliente();
        cliente_1.setNome("Thiago");
        Cliente cliente_2 = new Cliente();
        cliente_2.setNome("Júlia");

        listaCliente.add(cliente_1);
        listaCliente.add(cliente_2);
        System.out.println(listaCliente);

        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente cli = listaCliente.get(i); // Não é necessário o cast
            System.out.println(cli.getNome());
        }
        System.out.println();

        // for-each
        for (Cliente cliente: listaCliente) {
            System.out.println(cliente.getNome());
        }

        /*
         ArrayList<int> ou HashMap<int,double> não são válidos.
        */

        /*
         HashSet<Cliente> conjunto = new HashSet<Cliente>();
         HashMap<String, Cliente> mapa = new HashMap<String, Cliente>();
        */

    }

}
