package br.sis;

import br.sis.br.sis.services.CalculaDescontosEmSalario;
import br.sis.entidades.*;

/**
 * Created by alfredo on 28/04/17.
 */
public class Executar {
    public static void main(String arg[]){
        Pessoa pessoa = new Pessoa( "Alfredo", new CPF("03062834331") );
        CalculaDescontosEmSalario calculador = new CalculaDescontosEmSalario();

        SalarioBruto salarioBruto = new SalarioBruto(3100);
        System.out.println("Salario bruto: " +salarioBruto.getValor() );
        pessoa.setSalarioBruto( salarioBruto );
        SalarioLiquido salarioLiquido = new SalarioLiquido(salarioBruto.getValor());
        calculador.calcula( salarioBruto.getValor(), salarioLiquido );
        pessoa.setSalarioLiquido( salarioLiquido );


        System.out.println( pessoa );
    }
}
