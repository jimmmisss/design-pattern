package br.com.templatemethod.strategy;

import br.com.templatemethod.strategy.imposto.CalculaImposto;
import br.com.templatemethod.strategy.imposto.ICMS;
import br.com.templatemethod.strategy.imposto.ISS;
import br.com.templatemethod.strategy.model.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        var orcamento = new Orcamento(new BigDecimal("100"));
        var calculaImposto = new CalculaImposto();
        System.out.println(calculaImposto.calcular(orcamento, new ICMS()));
        System.out.println(calculaImposto.calcular(orcamento, new ISS()));
    }
}
