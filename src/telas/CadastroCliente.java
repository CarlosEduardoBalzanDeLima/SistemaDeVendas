package telas;

import crud.ClienteCrud;

public class CadastroCliente {
    final ClienteCrud clienteCrud;

    public CadastroCliente(ClienteCrud clienteCrud) {
        this.clienteCrud = clienteCrud;
    }

    public void cadastrarCliente() {
        clienteCrud.salvar();
    }

    public void substituirCliente() {
        clienteCrud.alterar();
    }

    public void deletarCliente() {
        clienteCrud.excluir();
    }

    public void listarCliente() {
        clienteCrud.listar();
    }
}