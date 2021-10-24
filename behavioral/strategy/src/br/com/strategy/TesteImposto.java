package br.com.strategy;

import br.com.strategy.imposto.CalculaImposto;
import br.com.strategy.imposto.ICMS;
import br.com.strategy.imposto.ISS;
import br.com.strategy.model.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        var orcamento = new Orcamento(new BigDecimal("100"));
        var calculaImposto = new CalculaImposto();
        System.out.println(calculaImposto.calcular(orcamento, new ICMS()));
        System.out.println(calculaImposto.calcular(orcamento, new ISS()));
    }
}
