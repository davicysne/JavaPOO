package LISTA2.Q01_LISTA2.Q05_LISTA2;

public class teste {
    public static void main(String[] args) {
        pais Brasil = new pais("BRA", "Brasil", 8515767.049, 215000000);
        pais Argentina = new pais("BRA", "Argentina", 2780400, 40117096);
        pais BrasilClone = new pais("BRA", "BrasilClone", 8515767.049, 215000000);

        System.out.println(Brasil.toString());
        System.out.println(Argentina.toString());
        System.out.printf("Densidade populacional: %.2f habitantes por km²%n", Brasil.densidadePop());
        System.out.printf("Densidade populacional: %.2f habitantes por km²%n", Argentina.densidadePop());

        if (Brasil.getCodISO().equals(BrasilClone.getCodISO())) {
            System.out.println(Brasil.getNamePais() + " possui o mesmo ISO de " + BrasilClone.getNamePais());
        } else {
            System.out.println("Ambos tem códigos ISO diferentes , não são iguais");
        }
    }
}

