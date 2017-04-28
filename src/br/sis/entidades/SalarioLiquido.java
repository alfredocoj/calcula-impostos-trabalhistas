package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class SalarioLiquido extends Salario {
    SalarioBruto salarioBruto;

    public SalarioLiquido() {}

    public SalarioLiquido(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "SalarioLiquido{" +
                "valor=" + valor +
                '}';
    }
}
