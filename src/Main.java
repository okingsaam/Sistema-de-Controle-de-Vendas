import Model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;

        do {

            System.out.println("=====Sistema de Cadastro de Produtos=====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o nome do produto: ");
                String nome = scanner.nextLine();

                Produto p = new Produto();
                p.nome = nome;

                produtos.add(p);

                System.out.println("Produto cadastrado com sucesso");

            }

            if (opcao == 2) {

                System.out.println("Lista de Produtos Cadastrados:");

                for (Produto produto : produtos) {
                    System.out.println(produto.nome);
                }

            }

        } while (opcao != 3);

        System.out.println("Sistema encerrado.");

    }

}