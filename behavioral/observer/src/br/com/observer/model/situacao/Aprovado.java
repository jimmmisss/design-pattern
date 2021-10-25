package br.com.observer.model.situacao;

import br.com.observer.exception.DomainException;
import br.com.observer.model.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) throws DomainException {
        orcamento.setSituacao(new Finalizado());
    }

}
