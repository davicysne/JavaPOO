package LISTA3.Q01_LISTA3.Q03_LISTA3;

public class contacorrente extends conta implements tributavel  {

    public contacorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return this.saldo * 0.01;
    }
}
