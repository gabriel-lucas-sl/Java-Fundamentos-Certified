package br.com.fiap.colecoes;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        // put()
        HashMap mapa = new HashMap();

        mapa.put("RM1234", "Thiago");
        mapa.put("RM4321", "Júlia");

        System.out.println(mapa);

        // get()
        System.out.println("\n" + mapa.get("RM1234"));

        // remove()
        mapa.remove("RM1234");
        System.out.println("\nLista atualizada\n" + mapa);
        System.out.println(mapa.get("RM123"));

    }


}
