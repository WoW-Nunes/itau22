package Notas;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        String nome;

        System.out.println("Qual nome do aluno: ");
        nome = sc.next();
        System.out.printf("Digite a primeira nota do aluno %s\n", nome);
        nota1 = sc.nextDouble();
        System.out.printf("Digite a segunda nota do aluno %s\n ", nome);
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;

        System.out.printf("A média final de %s foi %.1f \n", nome, media);
        
        if (media < 5) {
            System.out.println("Reprovado");
        } else if (media == 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }
        sc.close();

    }
}
