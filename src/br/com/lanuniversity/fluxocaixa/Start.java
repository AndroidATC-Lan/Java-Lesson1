package br.com.lanuniversity.fluxocaixa;

import java.util.Scanner;

public class Start {

    static int quantidadeVenda = 0;
    static int quantidadeProdutos = 0;
    static float valorParcial = (float) 0;
    static float valorTotal = (float) 0;

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de Vendas:");
        quantidadeVenda = pegaQuantidadeVenda();

        // Itineramos a quantidade de venda
        for (int i = 0; i < quantidadeVenda; i++) {
            quantidadeProdutos = pegaQuantidadeProdutos();

            // Itineramos a quantidade de produtos
            for (int j = 0; j < quantidadeProdutos; j++) {
                valorParcial += pegaValorParical();
            }

            valorTotal += valorParcial;
            System.out.println("Venda " + (i + 1) + " - Total: R$ " + valorParcial + ".");
            valorParcial = 0;
        }
        
        System.out.println("* Saldo do dia: R$ "+ valorTotal + ".");

    }

    private static int pegaQuantidadeVenda() {
        return (int) new Scanner(System.in).nextInt();
    }

    private static int pegaQuantidadeProdutos() {
        return (int) new Scanner(System.in).nextInt();
    }

    private static float pegaValorParical() {
        return (float) new Scanner(System.in).nextFloat();
    }

}
