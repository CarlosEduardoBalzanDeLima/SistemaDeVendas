package crud;

import interfaces.Repository;
import models.Produtos;

import java.util.Scanner;

public class ProdutoCrud implements Repository {
    Produtos produto = new Produtos();

    Scanner sc = new Scanner(System.in);

    @Override
    public void salvar() {
        System.out.println("Informe o nome do produto: ");
        produto.setNome(sc.nextLine());

        System.out.println("Informe o preço de compra: ");
        produto.setPrecoCompra(sc.nextDouble());
        sc.nextLine();

        System.out.println("Informe o preço de venda: ");
        produto.setPrecoVenda(sc.nextDouble());
        sc.nextLine();

        System.out.println("Infome o tipo do produto: ");
        produto.setUnidade(sc.nextLine());
    }

    @Override
    public void alterar() {
        System.out.println(produto);
        System.out.println("Escreva o produto que você deseja alterar");
        String nome = sc.nextLine();
        System.out.println("Agora escreva por qual vc deseja alterar");
        sc.nextLine();
        System.out.println("Produto alterado.");
    }

    @Override
    public void excluir() {
        produto.setNome(null);
        produto.setUnidade(null);
        produto.setPrecoCompra(null);
        produto.setPrecoVenda(null);
        System.out.println(produto);
        System.out.println("O produto foi excluido.");
    }

    @Override
    public void listar() {
        System.out.println(produto);
    }
}
