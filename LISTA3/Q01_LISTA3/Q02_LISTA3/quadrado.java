package LISTA3.Q01_LISTA3.Q02_LISTA3;

public class quadrado implements area{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado* lado;
    }
}
