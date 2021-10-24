package br.com.chainofresponsibility.desconto;

import br.com.chainofresponsibility.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeDezItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeDezItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQtdeItens() > 10) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
