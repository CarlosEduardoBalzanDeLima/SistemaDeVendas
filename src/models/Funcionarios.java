package models;

public class Funcionarios extends Usuario{

    private Double salario;
    private Double pix;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPix() {
        return pix;
    }

    public void setPix(Double pix) {
        this.pix = pix;
    }

    @Override
    public String darBoasVindas() {
        return "Olá funcionário!";
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "salario=" + salario +
                ", pix=" + pix +
                ", nome='" + getNome() + '\'' +
                ", telefone=" + getTelefone() +
                ", endereco='" + getEndereco() + '\'' +
                ", cpf=" + getCpf() +
                '}';
    }
}
