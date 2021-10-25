package br.com.command.service;

import br.com.command.model.GeraPedido;
import br.com.command.model.Orcamento;
import br.com.command.model.Pedido;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void executar(GeraPedido geraPedido) {
        var orcamento = new Orcamento(geraPedido.getValorOrcamento(), geraPedido.getQtdeItens());
        var pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvando pedido no banco de dados.");
        System.out.println("Enviando email para cliente sobre pedido.");
    }
}
