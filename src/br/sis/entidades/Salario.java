package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public abstract class Salario {

    protected double valor;

    public Salario(){}

    public Salario(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
