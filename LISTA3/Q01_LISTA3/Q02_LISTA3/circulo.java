package LISTA3.Q01_LISTA3.Q02_LISTA3;

public class circulo implements area{
    private double raio;

    public double getLado() {
        return raio;
    }

    public void setLado(double lado) {
        this.raio = lado;
    }

    public circulo(double lado) {
        this.raio = lado;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }
}
