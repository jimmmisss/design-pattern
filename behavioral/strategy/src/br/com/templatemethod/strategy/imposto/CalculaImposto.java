package br.com.templatemethod.strategy.imposto;

import br.com.templatemethod.strategy.model.Orcamento;

import java.math.BigDecimal;

public class CalculaImposto {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
