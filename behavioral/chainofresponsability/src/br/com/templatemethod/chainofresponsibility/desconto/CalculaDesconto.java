package br.com.templatemethod.chainofresponsibility.desconto;

import br.com.templatemethod.chainofresponsibility.model.Orcamento;

import java.math.BigDecimal;

public class CalculaDesconto {

    public BigDecimal calcular(Orcamento orcamento) {

        var desconto = new DescontoParaOrcamentoComMaisDeDezItens(
                new DescontoParaOrcamentoComValorAcimaDeSetecentos(
                        new SemDesconto()
                )
        );
        return desconto.calcular(orcamento);
    }
}
