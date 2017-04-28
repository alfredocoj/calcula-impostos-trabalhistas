package br.sis.entidades;

/**
 * Created by alfredo on 28/04/17.
 */
public class IRRFNivel5 extends IRRF {

    static final double desconto = 27.5;
    static final double constCalculo = 869.36;

    @Override
    public double calcula(double salario, SalarioLiquido salarioLiquido) {
        if(salario > 4664.68) {
            double salarioDescontado = salario*IRRFNivel5.desconto/100 - IRRFNivel5.constCalculo;
            salarioLiquido.setValor( salarioLiquido.getValor() - salarioDescontado );
            System.out.println( "Salario descontado (IRRF) 5: " + salarioDescontado );
            return  salario;
        } else{
            return proximo.calcula( salario, salarioLiquido );
        }
    }
}
