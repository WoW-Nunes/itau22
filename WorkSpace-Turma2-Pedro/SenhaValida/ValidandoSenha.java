package SenhaValida;

import java.util.Scanner;

public class ValidandoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        if (senha.length() < 4) {
            System.out.println("Deve ter no mínimo 6 dígitos !");
        }

        if (senha.equals("gama@2022")) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }

        sc.close();
    }
}
