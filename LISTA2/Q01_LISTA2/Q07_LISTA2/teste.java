package LISTA2.Q01_LISTA2.Q07_LISTA2;

public class teste {
    public static void main(String[] args) {
        conjunto conjuntoA = new conjunto();
        conjuntoA.adicionar("A");
        conjuntoA.adicionar("B");
        conjuntoA.adicionar("C");

        conjunto conjuntoB = new conjunto();
        conjuntoB.adicionar("B");
        conjuntoB.adicionar("C");
        conjuntoB.adicionar("D");

        System.out.println("Conjunto A:");
        conjuntoA.print();

        System.out.println("Conjunto B:");
        conjuntoB.print();

        conjunto uniao = conjuntoA.uniao(conjuntoB);
        System.out.println("União A ∪ B:");
        uniao.print();

        conjunto inter = conjuntoA.inter(conjuntoB);
        System.out.println("Interseção A ∩ B:");
        inter.print();

        conjunto menos = conjuntoA.menos(conjuntoB);
        System.out.println("Subtração A - B:");
        menos.print();



    }
}
