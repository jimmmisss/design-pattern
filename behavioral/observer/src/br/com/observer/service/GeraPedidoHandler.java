package br.com.observer.service;

import br.com.observer.model.GeraPedido;
import br.com.observer.model.Orcamento;
import br.com.observer.model.Pedido;
import br.com.observer.service.acoes.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private final List<AcaoAposGerarPedido> acaoAposGerarPedidos;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acaoAposGerarPedidos) {
        this.acaoAposGerarPedidos = acaoAposGerarPedidos;
    }

    public void executar(GeraPedido geraPedido) {
        var orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQtdeItens());
        var pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        this.acaoAposGerarPedidos.forEach(a -> a.executarAcao(pedido));
    }
}
