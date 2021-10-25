package br.com.command.model;

import java.math.BigDecimal;

public class GeraPedido {

    private final String cliente;
    private final BigDecimal valorOrcamento;
    private final Integer qtdeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer qtdeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdeItens = qtdeItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public Integer getQtdeItens() {
        return qtdeItens;
    }
}
