package br.sis.br.sis.services;

import br.sis.entidades.*;

/**
 * Created by alfredo on 28/04/17.
 */
public class CalculaDescontosEmSalario {

    public double calcula(double salario, SalarioLiquido salarioLiquido){
        try{
            Imposto imposto1 = new INSS();
            Imposto imposto2 = new ISS();
            Imposto imposto3 = new IRRFNivel1();
            Imposto imposto4 = new IRRFNivel2();
            Imposto imposto5 = new IRRFNivel3();
            Imposto imposto6 = new IRRFNivel4();
            Imposto imposto7 = new IRRFNivel5();

            imposto1.setProximo( imposto2 );
            imposto2.setProximo( imposto3 );
            imposto3.setProximo( imposto4 );
            imposto4.setProximo( imposto5 );
            imposto5.setProximo( imposto6 );
            imposto6.setProximo( imposto7 );

            return imposto1.calcula( salario, salarioLiquido );

        } catch (Exception e){
            System.out.println( "Exception Calculadora: "+ e.getMessage() );
            return 0;
        }
    }
}
