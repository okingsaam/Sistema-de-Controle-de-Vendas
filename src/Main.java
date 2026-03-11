import service.ProdutoService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ProdutoService service = new ProdutoService();

        int opcao;

        do {

            System.out.println("\n===== SISTEMA DE CADASTRO DE PRODUTOS =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Atualizar produto");
            System.out.println("6 - Buscar produto");
            System.out.println("7 - Valor total do estoque");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Preço: ");
                double preco = scanner.nextDouble();

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                service.cadastrarProduto(nome, preco, quantidade);
            }

            if (opcao == 2) {
                service.listarProdutos();
            }

            if (opcao == 4) {

                System.out.print("Digite o ID do produto: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                service.removerProduto(id);
            }

            if (opcao == 5) {

                System.out.print("ID do produto: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Novo nome: ");
                String nome = scanner.nextLine();

                System.out.print("Novo preço: ");
                double preco = scanner.nextDouble();

                System.out.print("Nova quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                service.atualizarProduto(id, nome, preco, quantidade);
            }

            if (opcao == 6) {

                System.out.print("Digite o ID do produto: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                service.buscarProduto(id);
            }

            if (opcao == 7) {
                service.valorTotalEstoque();
            }

        } while (opcao != 3);

        System.out.println("Sistema encerrado.");
    }
}