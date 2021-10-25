package br.com.state.situacao;

import br.com.state.exception.DomainException;
import br.com.state.model.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orçamento finalizado não pode ter desconto extra!");
    }
}
