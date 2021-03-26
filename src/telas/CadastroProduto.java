package telas;

import crud.ProdutoCrud;

public class CadastroProduto {
    final ProdutoCrud produtoCrud;

    public CadastroProduto(ProdutoCrud produtoCrud) {
        this.produtoCrud = produtoCrud;
    }

    public void cadastrarProduto() {
        produtoCrud.salvar();
    }

    public void substituirProduto() {
        produtoCrud.alterar();
    }

    public void deletarProduto() {
        produtoCrud.excluir();
    }

    public void listarProduto() {
        produtoCrud.listar();
    }
}
