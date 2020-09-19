package br.com.fiap.colecoes;

public class Set {
  public static void main(String[] args) {
        HashSet cursos = new HashSet();

        cursos.add("Java");
        cursos.add(".NET");
        cursos.add("Android");

        cursos.add("Java"); // Repetido!

        System.out.println(cursos);



    }
}
