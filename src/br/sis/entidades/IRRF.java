package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
abstract class IRRF implements Imposto {
    protected Imposto proximo;

    @Override
    public void setProximo(Imposto proximo) {
        this.proximo = proximo;
    }

    @Override
    public double calcula(double salario, SalarioLiquido salarioLiquido) {
        salarioLiquido.setValor( salarioLiquido.getValor() );
        return 0;
    }
}
