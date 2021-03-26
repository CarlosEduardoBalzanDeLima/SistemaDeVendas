import crud.ClienteCrud;
import crud.FuncionarioCrud;
import crud.ProdutoCrud;
import crud.VendaCrud;
import telas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario(new FuncionarioCrud());
        CadastroCliente cadastroCliente = new CadastroCliente(new ClienteCrud());
        CadastroProduto cadastroProduto = new CadastroProduto(new ProdutoCrud());
        CadastroVendas cadastroVendas = new CadastroVendas(new VendaCrud());

        Boolean executar = true;
        Integer decisao;

        while (executar) {
            String decisaoSaida = null;
            decisaoSaida = Login.login();

            Boolean avancar = false;

            if (decisaoSaida.equals("F")) {
                while (!avancar) {
                    System.out.println("O que você deseja? ");
                    System.out.println("1 - Funcionário");
                    System.out.println("2 - Produto");
                    System.out.println("3 - Venda");
                    System.out.println("4 - Sair");
                    decisao = sc.nextInt();
                    sc.nextLine();
                    if (decisao.equals(1)) {
                        System.out.println("O que você deseja? ");
                        System.out.println("1 - Cadastrar funcionário");
                        System.out.println("2 - Alterar funcionário");
                        System.out.println("3 - Listar funcionário");
                        System.out.println("4 - Excluir funcionário");
                        System.out.println("5 - Sair");
                        decisao = sc.nextInt();

                        if (decisao.equals(1)) {
                            cadastroFuncionario.cadastrarFuncionario();
                        } else if (decisao.equals(2)) {
                            cadastroFuncionario.substituirFuncionario();
                        } else if (decisao.equals(3)) {
                            cadastroFuncionario.listarFuncionarios();
                        } else if (decisao.equals(4)) {
                            cadastroFuncionario.deletarFuncionario();
                        } else if (decisao.equals(5)) {
                            System.out.println("Voltando para o início.");
                        }
                    } else if (decisao.equals(2)) {
                        System.out.println("O que você deseja? ");
                        System.out.println("1 - Cadastrar produto");
                        System.out.println("2 - Alterar produto");
                        System.out.println("3 - Listar produto");
                        System.out.println("4 - Excluir produto");
                        System.out.println("5 - Sair");
                        decisao = sc.nextInt();

                        if (decisao.equals(1)) {
                            cadastroProduto.cadastrarProduto();
                        } else if (decisao.equals(2)) {
                            cadastroProduto.substituirProduto();
                        } else if (decisao.equals(3)) {
                            cadastroProduto.listarProduto();
                        } else if (decisao.equals(4)) {
                            cadastroProduto.deletarProduto();
                        } else if (decisao.equals(5)) {
                            System.out.println("Voltando para o início.");
                        }
                    } else if (decisao.equals(3)) {
                        System.out.println("O que você deseja? ");
                        System.out.println("1 - Cadastrar venda");
                        System.out.println("2 - Alterar venda");
                        System.out.println("3 - Listar venda");
                        System.out.println("4 - Excluir venda");
                        System.out.println("5 - Sair");
                        decisao = sc.nextInt();

                        if (decisao.equals(1)) {
                            cadastroVendas.cadastrarVenda();
                        } else if (decisao.equals(2)) {
                            cadastroVendas.substituirVenda();
                        } else if (decisao.equals(3)) {
                            cadastroVendas.listarVenda();
                        } else if (decisao.equals(4)) {
                            cadastroVendas.deletarVenda();
                        } else if (decisao.equals(5)) {
                            System.out.println("Voltando para o início.");
                        }
                    } else if (decisao.equals(4)) {
                        System.out.println("Voltando para o início.");
                        avancar = true;
                    }
                }
            } else if (decisaoSaida.equals("C")) {
                System.out.println("O que você deseja? ");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Alterar cliente");
                System.out.println("3 - Listar cliente");
                System.out.println("4 - Excluir cliente");
                System.out.println("5 - Sair");
                decisao = sc.nextInt();

                if (decisao.equals(1)) {
                    cadastroCliente.cadastrarCliente();
                } else if (decisao.equals(2)) {
                    cadastroCliente.substituirCliente();
                } else if (decisao.equals(3)) {
                    cadastroCliente.listarCliente();
                } else if (decisao.equals(4)) {
                    cadastroCliente.deletarCliente();
                } else if (decisao.equals(5)) {
                    System.out.println("Voltando para o início.");
                    avancar = true;
                }
            } else {
                System.out.println("Até mais...");
                executar = false;
            }
        }
    }
}

