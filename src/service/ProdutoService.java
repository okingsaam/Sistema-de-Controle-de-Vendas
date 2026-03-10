package service;

import model.Produto;
import java.util.ArrayList;

public class ProdutoService {

    private ArrayList<Produto> produtos = new ArrayList<>();
    private int proximoId = 1;

    public void cadastrarProduto(String nome, double preco, int quantidade) {

        Produto p = new Produto();
        p.id = proximoId++;
        p.nome = nome;
        p.preco = preco;
        p.quantidade = quantidade;

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
                    "ID: " + produto.id +
                            " | Nome: " + produto.nome +
                            " | Preço: R$" + produto.preco +
                            " | Quantidade: " + produto.quantidade
            );
        }
    }

    public void removerProduto(int id) {

        for (Produto produto : produtos) {

            if (produto.id == id) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

    public void atualizarProduto(int id, String nome, double preco, int quantidade) {

        for (Produto produto : produtos) {

            if (produto.id == id) {

                produto.nome = nome;
                produto.preco = preco;
                produto.quantidade = quantidade;

                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado.");
    }

}