package crud;

import interfaces.Repository;
import models.Clientes;

import java.util.Scanner;

public class ClienteCrud implements Repository {
    Clientes cliente = new Clientes();

    Scanner sc = new Scanner(System.in);

    @Override
    public void salvar() {
        System.out.println("Informe seu nome: ");
        cliente.setNome(sc.nextLine());

        System.out.println("Informe seu endereço: ");
        cliente.setEndereco(sc.nextLine());

        System.out.println("Informe seu telefone: ");
        cliente.setTelefone(sc.nextInt());
        sc.nextLine();

        System.out.println("Informe seu limite: ");
        cliente.setLimiteCredito(sc.nextDouble());
        sc.nextLine();

        System.out.println("Informe seu cpf");
        cliente.setCpf(sc.nextDouble());
    }

    @Override
    public void alterar() {
        System.out.println(cliente);
        System.out.println("Escreva o cliente que você deseja alterar");
        String nome = sc.nextLine();
        System.out.println("Agora escreva por qual vc deseja alterar");
        sc.nextLine();
        System.out.println("Cliente alterado.");
    }

    @Override
    public void excluir() {
        cliente.setCpf(null);
        cliente.setEndereco(null);
        cliente.setNome(null);
        cliente.setTelefone(null);
        System.out.println(cliente);
        System.out.println("O cliente foi excluido.");
    }

    @Override
    public void listar() {
        System.out.println(cliente);
    }

}
