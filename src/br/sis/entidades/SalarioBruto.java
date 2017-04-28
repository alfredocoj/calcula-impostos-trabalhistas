package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class SalarioBruto extends Salario {

    public SalarioBruto() {
    }

    public SalarioBruto(double valor) {
        super( valor );
    }

    @Override
    public String toString() {
        return "SalarioBruto{" +
                "valor=" + valor +
                '}';
    }
}
