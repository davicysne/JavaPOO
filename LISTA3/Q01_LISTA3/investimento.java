package LISTA3.Q01_LISTA3;

public class investimento implements tributavel{
    private double rendimento;

    public investimento(double rendimento) {
        this.rendimento = rendimento;
    }

    @Override
    public double getValorImposto() {
        return rendimento * 0.15;
    }
}
