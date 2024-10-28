package LISTA3.Q01_LISTA3.Q07_LISTA3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        cadastro cadastro = new cadastro();
        Scanner scanner = new Scanner(System.in);
        //Aqui eu coloquei 3 pelo mesmo motivo
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a matrícula do aluno " + (i + 1) + ": ");
            int matricula = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite o IRA do aluno " + (i + 1) + ": ");
            double ira = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite o curso do aluno " + (i + 1) + ": ");
            String curso = scanner.nextLine();

            aluno aluno = new aluno(matricula, nome, ira, curso);
            cadastro.addALunos(aluno);
            System.out.println();
        }

        cadastro.imprimirAlunos();
    }
}
