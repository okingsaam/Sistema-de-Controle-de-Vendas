package service;

import model.Produto;
import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarProduto(String nome, double preco, int quantidade) {

        Produto p = new Produto();
        p.setId(proximoId++);
        p.setNome(nome);
        p.setPreco(preco);
        p.setQuantidade(quantidade);

        produtos.add(p);

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void listarProdutos() {

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        for (Produto produto : produtos) {

            System.out.println(
                    "ID: " + produto.getId() +
                            " | Nome: " + produto.getNome() +
                            " | Preço: R$" + produto.getPreco() +
                            " | Quantidade: " + produto.getQuantidade()
            );
        }
    }

    public void removerProduto(int id) {

        for (Produto produto : produtos) {

            if (produto.getId() == id) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public void atualizarProduto(int id, String nome, double preco, int quantidade) {

        for (Produto produto : produtos) {

            if (produto.getId() == id) {

                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);

                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public void buscarProduto(int id) {

        for (Produto produto : produtos) {

            if (produto.getId() == id) {

                System.out.println("Produto encontrado:");

                System.out.println(
                        "ID: " + produto.getId() +
                                " | Nome: " + produto.getNome() +
                                " | Preço: R$" + produto.getPreco() +
                                " | Quantidade: " + produto.getQuantidade()
                );

                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public void valorTotalEstoque() {

        double total = 0;

        for (Produto produto : produtos) {

            total += produto.getPreco() * produto.getQuantidade();

        }

        System.out.println("Valor total do estoque: R$ " + total);
    }
}