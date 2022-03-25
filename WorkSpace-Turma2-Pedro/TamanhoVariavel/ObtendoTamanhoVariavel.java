package TamanhoVariavel;

import java.util.Scanner;

public class ObtendoTamanhoVariavel {
    public static void main(String[] args) {
        String senha;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a senha: ");
        senha = sc.nextLine();
        System.out.println("A quantidade de dígitos da senha é: " + senha.length());
        sc.close();
    }
}
