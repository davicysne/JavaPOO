package LISTA2.Q01_LISTA2;

import java.util.Scanner;

public class teste {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        contador num = new contador();
        int opcao;

        System.out.println("Digite o número: ");
        num.valor = teclado.nextInt();

        System.out.println("Escolha a opção:\n 1-Incrementar\n 2-Zerar");
        opcao = teclado.nextInt();

        while(opcao != 1 && opcao !=2){
            System.out.println("Número Invalido. Escolha a opção 1 ou 2.");
            System.out.println("Escolha a opção:\n 1-Incrementar\n 2-Zerar");
            opcao = teclado.nextInt();
        }

        if (opcao == 1) {
            num.incrementar();
            System.out.println(num.valor);
        } else {
            num.zerar();
            System.out.println(num.valor);
        }
    }
}
