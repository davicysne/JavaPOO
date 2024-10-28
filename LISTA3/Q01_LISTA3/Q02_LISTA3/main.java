package LISTA3.Q01_LISTA3.Q02_LISTA3;

public class main {
    public static void main(String[] args) {
        area[] proj = new area[5];

        proj[0] = new quadrado(2);
        proj[1] = new retangulo(2, 6);
        proj[2] = new circulo(5);
        proj[3] = new quadrado(4);
        proj[4] = new retangulo(3,9);

        for (area projs : proj ) {
            System.out.println("Área : " + projs.calcularArea());
        }
    }
}

