package LISTA2.Q01_LISTA2.Q04_LISTA2;

public class teste {
    public static void main(String[] args) {
        circulo circunferencia1 = new circulo(4, 3);
        double area = circunferencia1.calcularArea();
        System.out.println("A área do circulo de raio 4: " +area);

        System.out.println("Valor após desinflar 2: " + circunferencia1.desinflar(2));
        System.out.println("Valor após inflar 6: " + circunferencia1.inflar(6));

    }
}
