package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class IRRFNivel2 extends IRRF {

    static final double desconto = 7.5;
    static final double constCalculo = 142.80;

    @Override
    public double calcula(double salario, SalarioLiquido salarioLiquido) {
        if(salario<=2826.65) {
            double salarioDescontado = salario*IRRFNivel2.desconto/100 - IRRFNivel2.constCalculo;
            salarioLiquido.setValor( salarioLiquido.getValor() - salarioDescontado );
            System.out.println( "Salario descontado (IRRF) 2: " + salarioDescontado );
            return salario ;
        } else{
            return proximo.calcula( salario, salarioLiquido );
        }
    }
}
