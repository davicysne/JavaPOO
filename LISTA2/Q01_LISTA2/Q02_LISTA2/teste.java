package LISTA2.Q01_LISTA2.Q02_LISTA2;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        plan ponto1 = new  plan(1.1, 2.3);
        plan ponto2 = new  plan(3.4, 6.4);

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println(ponto1.calcularDistanciaParaOrigem());

        System.out.println("Distância entre o ponto 1 e o ponto 2: " + distancia);
    }
}


