package LISTA2.Q01_LISTA2.Q06_LISTA2;

public class teste {
    public static void main(String[] args) {
        pessoa pai = new pessoa("Neto");
        pessoa mae = new pessoa("Alia");
        pessoa mae3 = new pessoa("Maria");
        pessoa mae2 = new pessoa("Alia");

        pessoa filho = new pessoa("Leo ", mae, pai);
        pessoa filho2 = new pessoa("Davi ", mae3, pai);

        System.out.println("A mae de " + filho.getNamePerson() + " é : " + mae.getNamePerson());
        System.out.println("O pai de " + filho.getNamePerson() + " é : " + pai.getNamePerson());

        System.out.println("Filho é igual a Filho2? " + filho.equals(filho2) );
    }
}