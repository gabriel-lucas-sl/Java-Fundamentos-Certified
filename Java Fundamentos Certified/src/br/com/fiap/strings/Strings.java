package br.com.fiap.strings;

public class Strings {

    public String stringIguais(){
        System.out.println("\nAs String são iguais");
        return "";
    }

    public String stringDiferentes(){
        System.out.println("\nAs Strings são diferentes");
        return "";
    }

    public static void main(String[] args) {



        // Declarando uma String
        String nome = new String();
        nome = "FIAP";

        System.out.println("FIAP - " + nome.length() + " caracteres");

        // Caracteres de escape
        nome = "\"FIAP\" - A melhor faculdade de tecnologia";
        System.out.println(nome);

        // Concatenação
        nome = "FIAP";
        String slogan = "A melhor faculdade de tecnologia";
        String faculdade = nome;
        faculdade += " - ";
        faculdade += slogan;
        System.out.println(faculdade);

        faculdade = nome + " - " + slogan;
        System.out.println(faculdade);

        faculdade = nome.concat(" - ") + (slogan);
        System.out.println(faculdade);

       // Comparação de Strings
       String nome_1 = new String("FIAP");
       String nome_2 = new String("FIAP");
       if (nome_1 == nome_2) {
           System.out.println("As Strings são iguais");

       } else {
           System.out.println("As String são diferentes");

       }

       String nome_3 = "FIAP";
       String nome_4 = "FIAP";
       if (nome_3 == nome_4) {
           System.out.println("\nStrings iguais");

       } else {
           System.out.println("\nStrings diferentes");

       }

       Strings str = new Strings();
       nome_1 = "fiap";
       // Equals
       if (nome_1.equals(nome_2)) {
           str.stringIguais();

       } else {
           str.stringDiferentes();
       }
       // EqualsIgnoreCase
       if (nome_1.equalsIgnoreCase(nome_2)){
           str.stringIguais();

       } else {
           str.stringDiferentes();
       }
       // startsWith
        String facu = "FIAP - A Melhor Faculdade de Tecnologia";
       if (facu.startsWith("FIAP")) {
           System.out.println("A String começa com FIAP");
       } else {
           System.out.println("A string nao começa com FIAP");
       }
       // endsWith
       if (facu.endsWith("gia")) {
           System.out.println("A string termina com gia");
       } else {System.out.println("A string termina com gia");}

        // length como método
        int caracteres = facu.length();
        System.out.println("\nA String possui " + caracteres + " caracteres");

        // charAt
        char caracter = facu.charAt(1); // I
        System.out.println("\nO segundo caracter da string é: " + caracter);

        // indexOf
        int posicao = facu.indexOf("a"); // retorna a PRIMEIRA ocorrência
        System.out.println("\nO índice do caracter \"a\" na string é " + posicao + "\nFrase: " + facu);
        int posicaoInexistente = facu.indexOf("x");
        System.out.println("O índice do caracter \"x\" na string é " + posicaoInexistente);
        if (posicaoInexistente == -1){
            System.out.println("O índice do caracter \"x\" na string é inexistente");
        }
        posicao = facu.indexOf("Faculdade");
        System.out.println("O índice do caracter \"Faculdade\" na string é " + posicao);
        // lastIndexOf
        posicao = facu.lastIndexOf("a");
        System.out.println("O índice do último caracter \"a\" na string é " + posicao);
        posicao = facu.lastIndexOf("Tecnologia");
        System.out.println("O índice do último caracter \"Tecnologia\" na string é " + posicao);

        // subString
        String nova = facu.substring(0, 16);
        System.out.println("\nA nova string é: " + nova);

        nova = facu.substring(facu.indexOf("M"), 25);
        System.out.println("A nova string é: " + nova);

        nova = facu.substring(16);
        System.out.println("A nova string é: " + nova);

        nova = facu.substring(facu.lastIndexOf("T"));
        System.out.println("A nova string é: " + nova);

        // toUpperCase toLowerCase
        nova = facu.toUpperCase();
        System.out.println("\nA nova string é: " + nova);

        facu.toLowerCase();
        System.out.println("A nova string é: " + facu); // String são imutáveis

        nova = facu.toLowerCase();
        System.out.println("A nova string é: " + nova);

        // replace
        nova = facu.replace("a", "ei");
        System.out.println("\nA nova string é: " + nova);

        nova = facu.replace("FIAP", "IMPACTA");
        System.out.println("A nova string é: " + nova);

        // split
        String[] palavras = facu.split(" ");
        System.out.println();
        for (String p : palavras) {
            System.out.println(p);
        }

        String disciplinas = "DMDD;CMTUP;AGSD;DTBSQL;RSWD;AIC";
        String[] dis = disciplinas.split(";");
        for (String d : dis) {
            System.out.println(d);
        }

    }

}
