package br.sis.utils;

import br.sis.entidades.SalarioBruto;
import br.sis.entidades.SalarioLiquido;

/**
 * Created by alfredo on 28/04/17.
 */
public abstract class Filtro {
    protected Filtro outroFiltro;

    public Filtro(){}

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    public abstract SalarioLiquido filtra(SalarioBruto salario);

}
