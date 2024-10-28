package LISTA3.Q01_LISTA3.Q05_LISTA3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class testeCPF {
    public static void main(String[] args) {
        Set<String> codigoPessoal = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 CPF's para adicionar no array: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o CPF " + (i + 1) + " : ");
            String cpf = sc.nextLine();
            codigoPessoal.add(cpf);
        }

        System.out.println("CPF's cadastrados: ");

        for (String cpf: codigoPessoal) {
            System.out.println(cpf);
        }

    }
}
