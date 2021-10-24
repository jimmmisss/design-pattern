package br.com.templatemethod.desconto;

import br.com.templatemethod.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeDezItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeDezItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQtdeItens() > 5;
    }
}
