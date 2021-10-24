package br.com.chainofresponsibility.desconto;

import br.com.chainofresponsibility.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorAcimaDeSetecentos extends Desconto {

    public DescontoParaOrcamentoComValorAcimaDeSetecentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {

        if (orcamento.getValor().compareTo(new BigDecimal("700")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.07"));
        }

        return proximo.calcular(orcamento);
    }
}
