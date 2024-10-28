package LISTA2.Q01_LISTA2.Q03_LISTA2;

public class teste {
    public static void main(String[] args) {
        reta reta1 = new reta(4, 2);
        double x = 3, y = 14;
        System.out.println(" Equação da reta 1: " + reta1.getEquacao());


        if (reta1.pertenceReta(x, y)) {
            System.out.println("O ponto (" + x + ", " + y + ") pertence a reta: " + reta1.getEquacao());
        } else {
            System.out.println("O ponto (" + x + ", " + y + ") não pertence a reta: " + reta1.getEquacao());
        }
    }
}
