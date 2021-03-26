package crud;

import interfaces.Repository;
import models.Funcionarios;
import java.util.Scanner;

public class FuncionarioCrud implements Repository {
    Funcionarios funcionario = new Funcionarios();

    Scanner sc = new Scanner(System.in);

    @Override
    public void salvar() {
        System.out.println("Informe seu nome: ");
        funcionario.setNome(sc.nextLine());

        System.out.println("Informe seu endereço: ");
        funcionario.setEndereco(sc.nextLine());

        System.out.println("Informe seu telefone: ");
        funcionario.setTelefone(sc.nextInt());
        sc.nextLine();

        System.out.println("Informe seu salário: ");
        funcionario.setSalario(sc.nextDouble());
        sc.nextLine();

        System.out.println("Informe seu pix");
        funcionario.setPix(sc.nextDouble());
        sc.nextLine();

        System.out.println("Informe seu cpf");
        funcionario.setCpf(sc.nextDouble());
    }

    @Override
    public void alterar() {
        System.out.println(funcionario);
        System.out.println("Escreva o funcionário que você deseja alterar");
        String nome = sc.nextLine();
        System.out.println("Agora escreva por qual vc deseja alterar");
        sc.nextLine();
        System.out.println("Funcionário alterado.");
    }

    @Override
    public void excluir() {
        funcionario.setPix(null);
        funcionario.setCpf(null);
        funcionario.setEndereco(null);
        funcionario.setNome(null);
        funcionario.setSalario(null);
        funcionario.setTelefone(null);
        System.out.println(funcionario);
        System.out.println("O funcionário foi excluido.");
    }

    @Override
    public void listar() {
        System.out.println(funcionario);
    }
}
