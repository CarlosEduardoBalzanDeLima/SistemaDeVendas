package telas;

import crud.FuncionarioCrud;

public class CadastroFuncionario {

    final FuncionarioCrud funcionarioCrud;

    public CadastroFuncionario(FuncionarioCrud funcionarioCrud) {
        this.funcionarioCrud = funcionarioCrud;
    }

    public void cadastrarFuncionario() {
        funcionarioCrud.salvar();
    }

    public void substituirFuncionario() {
        funcionarioCrud.alterar();
    }

    public void deletarFuncionario() {
        funcionarioCrud.excluir();
    }

    public void listarFuncionarios() {
        funcionarioCrud.listar();
    }
}