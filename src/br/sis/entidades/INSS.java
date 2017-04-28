package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class INSS implements Imposto {

    protected Imposto proximo;

    @Override
    public void setProximo(Imposto proximo) {
        this.proximo = proximo;
    }

    @Override
    public double calcula(double salario, SalarioLiquido salarioLiquido) {
        double salarioDescontado = salario*0.11;
        salarioLiquido.setValor( salarioLiquido.getValor() - salarioDescontado );
        System.out.println( "salario descontado (INSS): "+salarioDescontado );
        return proximo.calcula(salario, salarioLiquido);
    }
}
