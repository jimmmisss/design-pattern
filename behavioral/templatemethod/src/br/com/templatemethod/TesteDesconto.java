package br.com.templatemethod;

import br.com.templatemethod.desconto.CalculaDesconto;
import br.com.templatemethod.model.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args) {

        var primeiro = new Orcamento(new BigDecimal("200"), 6);
        var segundo = new Orcamento(new BigDecimal("1000"), 5);
        var terceiro = new Orcamento(new BigDecimal("500"), 5);

        var calculaDesconto = new CalculaDesconto();
        System.out.println(calculaDesconto.calcular(primeiro));
        System.out.println(calculaDesconto.calcular(segundo));
        System.out.println(calculaDesconto.calcular(terceiro));
    }
}
