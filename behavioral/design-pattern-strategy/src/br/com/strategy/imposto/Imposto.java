package br.com.strategy.imposto;

import br.com.strategy.model.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
