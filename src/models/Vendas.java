package models;

public class Vendas {
    private Integer idVenda;
    private String nomeVendedor;
    private Integer quantidadeItens;
    private Double valorVenda;
    private String nomeEmpresa;

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {
        return "Vendas{" +
                "idVenda=" + idVenda +
                ", nomeVendedor='" + nomeVendedor + '\'' +
                ", quantidadeItens=" + quantidadeItens +
                ", valorVenda=" + valorVenda +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                '}';
    }
}
