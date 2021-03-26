package models;

public class Clientes extends Usuario{

    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String darBoasVindas() {
        return "Olá cliente!";
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "limiteCredito=" + limiteCredito +
                ", nome='" + getNome() + '\'' +
                ", telefone=" + getTelefone() +
                ", endereco='" + getEndereco() + '\'' +
                ", cpf=" + getCpf() +
                '}';
    }
}
