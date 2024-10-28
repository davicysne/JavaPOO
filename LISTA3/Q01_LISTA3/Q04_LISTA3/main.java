package LISTA3.Q01_LISTA3.Q04_LISTA3;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<circulo> circulos = new ArrayList<>();

        circulos.add(new circulo(2.3));
        circulos.add(new circulo(2));
        circulos.add(new circulo(4.5));
        circulos.add(new circulo(1.2));
        circulos.add(new circulo(7.3));

        for (circulo circulo: circulos) {
            System.out.printf("Área %.2f%n ", circulo.AreaCalc());
        }
    }
}
