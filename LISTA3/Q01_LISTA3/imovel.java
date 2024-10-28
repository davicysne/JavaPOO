package LISTA3.Q01_LISTA3;

public class imovel implements tributavel{
    private double valorImovel;

    public imovel(double valorImovel) {
        this.valorImovel = valorImovel;
    }

    @Override
    public double getValorImposto() {
        return valorImovel * 0.3;
    }
}
