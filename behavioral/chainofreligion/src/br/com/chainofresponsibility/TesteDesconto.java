package br.com.chainofresponsibility;

import br.com.chainofresponsibility.desconto.CalculaDesconto;
import br.com.chainofresponsibility.model.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args) {

        var primeiro = new Orcamento(new BigDecimal("2000"), 6);
        var segundo = new Orcamento(new BigDecimal("1000"), 5);
        var terceiro = new Orcamento(new BigDecimal("4200"), 5);

        var calculaDesconto = new CalculaDesconto();
        System.out.println(calculaDesconto.calcular(primeiro));
        System.out.println(calculaDesconto.calcular(segundo));
        System.out.println(calculaDesconto.calcular(terceiro));
    }
}
