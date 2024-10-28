package LISTA3.Q01_LISTA3.Q03_LISTA3;

public class teste {
    public static void main(String[] args) {
        contacorrente contaCorrente = new contacorrente(1500);
        contaCorrente.depositar(2000);
        System.out.println(contaCorrente.obterSaldo());
        contaCorrente.sacar(200);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.obterSaldo());
        System.out.println("Tributos da Conta Corrente: " + contaCorrente.calculaTributos());



        contapoupanca contaPoupanca = new contapoupanca(1500);
        contaPoupanca.depositar(200);
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.obterSaldo());

        seguro seguroVida = new seguro();
        System.out.println("Tributos do Seguro de Vida: " + seguroVida.calculaTributos());
    }
}