package br.com.command;

import br.com.command.model.GeraPedido;
import br.com.command.service.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestePedido {

    public static void main(String[] args) {

        var cliente = "Wesley Pereira";
        var valorOrcamento = new BigDecimal("745.99");
        var qtdeItens = 3;

        var geraPedido = new GeraPedido(cliente, valorOrcamento, qtdeItens);
        var geraPedidoHandler = new GeraPedidoHandler();
        geraPedidoHandler.executar(geraPedido);
    }
}
