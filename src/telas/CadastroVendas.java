package telas;

import crud.VendaCrud;

public class CadastroVendas {
    final VendaCrud vendaCrud;

    public CadastroVendas(VendaCrud vendaCrud) {
        this.vendaCrud = vendaCrud;
    }

    public void cadastrarVenda() {
        vendaCrud.salvar();
    }

    public void substituirVenda() {
        vendaCrud.alterar();
    }

    public void deletarVenda() {
        vendaCrud.excluir();
    }

    public void listarVenda() {
        vendaCrud.listar();
    }
}
