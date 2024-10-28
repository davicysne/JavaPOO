package LISTA2.Q01_LISTA2.Q03_LISTA2;

public class reta {
    // reta y = ax + b
    public double cA;
    public double cL;

    public double getcA() {
        return cA;
    }

    public void setcA(double cA) {
        this.cA = cA;
    }

    public double getcL() {
        return cL;
    }

    public void setcL(double cL) {
        this.cL = cL;
    }

    public reta(int coeficienteAngular, int coeficienteLinear) {
        this.cA = coeficienteAngular;
        this.cL = coeficienteLinear;
    }

    public String getEquacao() {
        return "y = " + cA + "x + " + cL;
    }

    public  boolean pertenceReta(double x , double y) {
        return  y == (this.cA * x  + this.cL );
    }
}