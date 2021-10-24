package br.com.templatemethod.strategy.imposto;

import br.com.templatemethod.strategy.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
