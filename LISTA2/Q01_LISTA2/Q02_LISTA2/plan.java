package LISTA2.Q01_LISTA2.Q02_LISTA2;

public class plan {
    private double x;
    private double y;

    public plan(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistanciaParaOrigem() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public double calcularDistancia(plan  outroPonto) {
        return Math.sqrt(Math.pow(outroPonto.x - this.x, 2) + Math.pow(outroPonto.y - this.y, 2));
    }
}
