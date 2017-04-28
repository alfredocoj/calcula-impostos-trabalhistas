package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public interface Imposto {
    double calcula(double salario, SalarioLiquido salarioLiquido);

    void setProximo(Imposto proximo);
}
