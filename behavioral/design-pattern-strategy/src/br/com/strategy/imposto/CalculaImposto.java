package br.com.strategy.imposto;

import br.com.strategy.model.Orcamento;

import java.math.BigDecimal;

public class CalculaImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
