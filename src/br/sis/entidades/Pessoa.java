package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class Pessoa {
    private String nome;
    private CPF cpf;
    private SalarioBruto salarioBruto;
    private SalarioLiquido salarioLiquido;

    public Pessoa(){}

    public Pessoa(String nome, CPF cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public SalarioBruto getSalarioBruto() {return salarioBruto;}

    public void setSalarioBruto(SalarioBruto salario) {this.salarioBruto = salario; }

    public SalarioLiquido getSalarioLiquido() {return salarioLiquido;}

    public void setSalarioLiquido(SalarioLiquido salarioLiquido){
        try {
            this.salarioLiquido = salarioLiquido;
        } catch (Exception e){
            System.out.println("Exception pessoa: "+ e );
        }

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }

    public void setSalarioLiquido(double valor) {
        this.salarioLiquido.setValor( valor );
    }
}
