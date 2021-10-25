package br.com.state.situacao;

import br.com.state.desconto.DescontoParaOrcamentoComMaisDeCincoItens;
import br.com.state.desconto.DescontoParaOrcamentoComValorMaiorQueQuinhentos;
import br.com.state.desconto.SemDesconto;
import br.com.state.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        var desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
