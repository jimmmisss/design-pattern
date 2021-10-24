package br.com.templatemethod.model;

import java.math.BigDecimal;

public class Orcamento {

    private final BigDecimal valor;
    private final Integer qtdeItens;

    public Orcamento(BigDecimal valor, Integer qtdeItens) {
        this.valor = valor;
        this.qtdeItens = qtdeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQtdeItens() {
        return qtdeItens;
    }
}
