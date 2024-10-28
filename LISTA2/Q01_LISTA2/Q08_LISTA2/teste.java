package LISTA2.Q01_LISTA2.Q08_LISTA2;


public class teste {
    public static void main(String[] args) {

        matriz matrizA = new matriz(3, 3);
        matrizA.setElemento(0, 0, 1);
        matrizA.setElemento(0, 1, 2);
        matrizA.setElemento(0, 2, 3);
        matrizA.setElemento(1, 0, 4);
        matrizA.setElemento(1, 1, 5);
        matrizA.setElemento(1, 2, 6);
        matrizA.setElemento(2, 0, 7);
        matrizA.setElemento(2, 1, 8);
        matrizA.setElemento(2, 2, 9);

        System.out.println("Matriz A:");
        matrizA.exibir();

        matriz matrizB = new matriz(3, 3);
        matrizB.setElemento(0, 0, 9);
        matrizB.setElemento(0, 1, 8);
        matrizB.setElemento(0, 2, 7);
        matrizB.setElemento(1, 0, 6);
        matrizB.setElemento(1, 1, 5);
        matrizB.setElemento(1, 2, 4);
        matrizB.setElemento(2, 0, 3);
        matrizB.setElemento(2, 1, 2);
        matrizB.setElemento(2, 2, 1);

        System.out.println("\nMatriz B:");
        matrizB.exibir();

        matriz soma = matrizA.adicionar(matrizB);
        System.out.println("\nA + B:");
        soma.exibir();

        matriz subtracao = matrizA.subtrair(matrizB);
        System.out.println("\nA - B:");
        subtracao.exibir();

        matriz multiplicacao = matrizA.multiplicar(matrizB);
        System.out.println("\nA * B:");
        multiplicacao.exibir();

        System.out.println("\nA é simétrica? " + matrizA.isSimetrica());

        System.out.println("A é identidade? " + matrizA.isIdentidade());

        matriz transpostaA = matrizA.transposta();
        System.out.println("\nTransposta de A:");
        transpostaA.exibir();

        matriz opostaA = matrizA.oposta();
        System.out.println("\nOposta de A:");
        opostaA.exibir();

        matriz nula = matriz.gerarNula(2, 2);
        System.out.println("\nMatriz Nula 2x2:");
        nula.exibir();

        matriz copiaA = matrizA.copiar();
        System.out.println("\nCópia de A:");
        copiaA.exibir();
    }
}
