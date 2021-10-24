package br.com.templatemethod.strategy.imposto;

import br.com.templatemethod.strategy.model.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
