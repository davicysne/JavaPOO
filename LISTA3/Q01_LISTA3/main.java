package LISTA3.Q01_LISTA3;

public class main {
    public static void main(String[] args) {
        gerenciadordeimpostos gerenciador = new gerenciadordeimpostos("Davi");

        imovel hotel = new imovel(1500000);
        investimento bolsa = new investimento(2000);

        gerenciador.adicionar(hotel);
        gerenciador.adicionar(bolsa);

        System.out.println("Total de impostos do Sr(a). " + gerenciador.getNamePerson() + ": " + gerenciador.getTotalImposto() + "R$");
    }

}
