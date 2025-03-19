package org.example;

import org.example.models.Loja;
import org.example.models.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = new Loja(1, "Loja Legal", new ArrayList<>());

        int opcao;
        do {
            System.out.println("\n--- Menu ---");

            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            scanner.nextLine();
            switch (opcao) {
                case 1:
                    Produto produto = new Produto();
                    System.out.println("Opção de cadastro selecionada.");
                    System.out.println("Informe o código do produto: ");
                    produto.setCodigo(scanner.nextInt());
                    System.out.println("Informe o nome do produto: ");
                    produto.setNome(scanner.next());
                    System.out.println("Informe o preco do produto: ");
                    produto.setPreco(scanner.nextDouble());
                    loja.addProduto(produto);
                    break;
                case 2:
                    System.out.println("Opção de busca selecionada.");
                    System.out.println("Informe o código do produto: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    Produto produtoBuscado = loja.getProdutoPorCodigo(codigo);
                    if (produtoBuscado == null) {
                        System.out.println("Produto Inexistente");
                        break;
                    }

                    System.out.println(produtoBuscado.toString());

                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }while (opcao != 3);
        scanner.close();

    }

}