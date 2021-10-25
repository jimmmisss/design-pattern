package br.com.state.situacao;

import br.com.state.exception.DomainException;
import br.com.state.model.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);

    public void aprovar(Orcamento orcamento) throws DomainException {
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) throws DomainException{
        throw new DomainException("Orçamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) throws DomainException {
        throw new DomainException("Orçamento não pode ser finalizado!");
    }
}
