package br.com.templatemethod.desconto;

import br.com.templatemethod.model.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorAcimaDeQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorAcimaDeQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
