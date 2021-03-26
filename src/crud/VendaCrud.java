package crud;

import interfaces.Repository;
import models.Vendas;

import java.util.Scanner;

public class VendaCrud implements Repository {
    Vendas venda = new Vendas();

    Scanner sc = new Scanner(System.in);

    @Override
    public void salvar() {
        System.out.println("Infome o nome do vendedor: ");
        venda.setNomeVendedor(sc.nextLine());

        System.out.println("Infome o nome da empresa: ");
        venda.setNomeEmpresa(sc.nextLine());

        System.out.println("Informe o id da venda: ");
        venda.setIdVenda(sc.nextInt());
        sc.nextLine();

        System.out.println("Informe o valor da venda: ");
        venda.setValorVenda(sc.nextDouble());
        sc.nextLine();

        System.out.println("Informe a quantidade de intens: ");
        venda.setQuantidadeItens(sc.nextInt());
    }

    @Override
    public void alterar() {
        System.out.println(venda);
        System.out.println("Escreva a venda que você deseja alterar");
        String nome = sc.nextLine();
        System.out.println("Agora escreva por qual vc deseja alterar");
        sc.nextLine();
        System.out.println("Venda alterado.");
    }

    @Override
    public void excluir() {
        venda.setValorVenda(null);
        venda.setIdVenda(null);
        venda.setNomeVendedor(null);
        venda.setQuantidadeItens(null);
        venda.setNomeEmpresa(null);
        System.out.println(venda);
        System.out.println("A venda foi excluido.");
    }

    @Override
    public void listar() {
        System.out.println(venda);
    }
}
