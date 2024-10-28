package LISTA3.Q01_LISTA3.Q04_LISTA3;

public class circulo {
    private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    public double AreaCalc() {
        return Math.PI * (this.raio * this.raio);
    }
}
