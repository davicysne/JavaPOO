package LISTA3.Q01_LISTA3.Q03_LISTA3;

public class conta {
    double saldo;

    public conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0 ){
            this.saldo += valor;
        } else {
            System.out.println("Precisa ser um valor positivo!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Seu novo saldo é: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque");
        }
    }


    public double obterSaldo() {
        return this.saldo;
    }

}
