package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class IRRFNivel1 extends IRRF {

    public void setProximo(Imposto imposto){
        this.proximo = imposto;
    }
    @Override
    public double calcula(double salario, SalarioLiquido salarioLiquido) {

        if( salario < 1903.98 ) {
            return super.calcula( salario, salarioLiquido );
        } else {
            return proximo.calcula( salario, salarioLiquido );
        }
    }
}
