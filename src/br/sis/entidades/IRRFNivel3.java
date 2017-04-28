package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class IRRFNivel3 extends IRRF {

    static final double desconto = 15;
    static final double constCalculo = 354.80;

    @Override
    public double calcula(double salario, SalarioLiquido salarioLiquido) {
        if(salario <= 3751.5) {
            double salarioDescontado = salario*IRRFNivel3.desconto/100 - IRRFNivel3.constCalculo;
            salarioLiquido.setValor( salarioLiquido.getValor() - salarioDescontado );
            System.out.println( "Salario descontado (IRRF) 3: " + salarioDescontado );
            return  salario;
        } else{
            return proximo.calcula( salario, salarioLiquido );
        }
    }
}
