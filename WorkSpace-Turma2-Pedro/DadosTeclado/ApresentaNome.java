package DadosTeclado;

import java.util.Scanner;

public class ApresentaNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sobrenome;
        System.out.println("Entre com o nome desejado: ");
        nome = sc.nextLine();
        System.out.println("Entre com o sobrenome desejado: ");
        sobrenome = sc.nextLine();
        System.out.printf("O nome do usuário é: %s %s ", nome, sobrenome);

        sc.close();
    }
}
