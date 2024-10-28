package LISTA3.Q01_LISTA3.Q06_LISTA3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // "Ola", "Pedro", "Garrafa","mouse"
        conjuntopalavras conjuntoPalavras = new conjuntopalavras();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra para checar se está no vocabulário do sistema");
        String resposta = sc.nextLine();

        boolean resultado = conjuntoPalavras.contemPalavra(resposta);

        System.out.println("Todas as palavras estão no conjunto do sistema?" + resultado);
    }
}
