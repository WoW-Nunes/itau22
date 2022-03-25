package Produto;

import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeProduto;
        int valorProduto, quantidadeProduto, estoque;

        System.out.println("Entre com o nome do produto: ");
        nomeProduto = sc.next();
        System.out.println("Qual o valor: ");
        valorProduto = sc.nextInt();
        System.out.println("Qual a quantidade: ");
        quantidadeProduto = sc.nextInt();
        estoque = valorProduto * quantidadeProduto;

        System.out.printf("O produto é %s e o valor total em estoque será: %d", nomeProduto, estoque);

        sc.close();
    }
}
