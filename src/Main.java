import java.util.ArrayList;
import java.util.Scanner;

void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> produtos = new ArrayList<>();

    int opcao;
    do {
        System.out.println("=====SISTEMA DE PRODUTOS=====");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listrar Produtos");
        System.out.println("3 - Sair");

        System.out.println(" Escolha: ");
        opcao = scanner.nextInt();
        scanner.next();


        if (opcao == 1) {
            System.out.println("digite o nome do produto");
            String nome = scanner.nextLine();

            produtos.add(nome);

            System.out.println("Produto Cadastrado com Sucesso");

        }

        if (opcao == 2) {
            System.out.println("Lista de Produtos Cadastrados");
            for (String produto : produtos) {
                System.out.println(produto);
            }
        }
    } while (opcao != 3); {
    }
}

