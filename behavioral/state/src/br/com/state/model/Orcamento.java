package br.com.state.model;

import br.com.state.situacao.EmAnalise;
import br.com.state.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer qtdeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, Integer qtdeItens) {
        this.valor = valor;
        this.qtdeItens = qtdeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        var calcularDescontoExtra = this.situacao.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(calcularDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQtdeItens() {
        return qtdeItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
}
