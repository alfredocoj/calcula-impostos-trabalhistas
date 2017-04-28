package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class IRRFNivel4 extends IRRF {

    static final double desconto = 22.5;
    static final double constCalculo = 636.13;

    @Override
    public double calcula(double salario, SalarioLiquido salarioLiquido) {
        if(salario <= 4664.68) {
            double salarioDescontado = salario*IRRFNivel4.desconto/100 - IRRFNivel4.constCalculo;
            salarioLiquido.setValor( salarioLiquido.getValor() - salarioDescontado );
            System.out.println( "Salario descontado (IRRF) 4: " + salarioDescontado );
            return  salario;
        } else{
            return proximo.calcula( salario, salarioLiquido );
        }
    }
}
