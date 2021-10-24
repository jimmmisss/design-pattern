package br.com.templatemethod.desconto;

import br.com.templatemethod.model.Orcamento;

import java.math.BigDecimal;

public class CalculaDesconto {

    public BigDecimal calcular(Orcamento orcamento) {

        var desconto = new DescontoParaOrcamentoComMaisDeDezItens(
                new DescontoParaOrcamentoComValorAcimaDeQuinhentos(
                        new SemDesconto()
                )
        );
        return desconto.calcular(orcamento);
    }
}
