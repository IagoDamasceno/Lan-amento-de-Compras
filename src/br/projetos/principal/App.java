package br.projetos.principal;

import java.util.Scanner;

import br.projetos.modelos.Cartao;

public class App {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de gerenciamento de cartões!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        Cartao cartao = new Cartao(limite);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Realizar compra");
            System.out.println("2. Exibir compras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da compra: ");
                    scanner.nextLine(); // Consumir a quebra de linha
                    String descricao = scanner.nextLine();
                    System.out.print("Digite o valor da compra: ");
                    double valor = scanner.nextDouble();
                    cartao.realizarCompra(new br.projetos.modelos.Compra(descricao, valor));
                    break;
                case 2:
                    cartao.exibirCompras();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);
        
    }
}
