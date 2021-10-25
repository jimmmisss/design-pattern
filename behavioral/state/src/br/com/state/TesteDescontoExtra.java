package br.com.state;

import br.com.state.model.Orcamento;
import br.com.state.situacao.CalculadoraDeDesconto;

import java.math.BigDecimal;

public class TesteDescontoExtra {

    public static void main(String[] args) {

        var primeiro = new Orcamento(new BigDecimal("200"), 6);
        var segundo = new Orcamento(new BigDecimal("1000"), 2);
        var terceiro = new Orcamento(new BigDecimal("500"), 1);

        var calculadoraDeDesconto = new CalculadoraDeDesconto();
        System.out.println(calculadoraDeDesconto.calcular(primeiro));
        System.out.println(calculadoraDeDesconto.calcular(segundo));
        System.out.println(calculadoraDeDesconto.calcular(terceiro));
    }
}
