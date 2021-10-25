package br.com.observer.model.situacao;

import br.com.observer.exception.DomainException;
import br.com.observer.model.Orcamento;

import java.math.BigDecimal;

public class Finalizado extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
    }

}
