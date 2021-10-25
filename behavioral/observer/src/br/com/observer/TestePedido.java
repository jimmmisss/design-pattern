package br.com.observer;

import br.com.observer.model.GeraPedido;
import br.com.observer.service.GeraPedidoHandler;
import br.com.observer.service.acoes.CriarPedidoNoBanco;
import br.com.observer.service.acoes.EnviarPedidoPorEmail;

import java.math.BigDecimal;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class TestePedido {

    public static void main(String[] args) {

        var cliente = "Wesley Pereira";
        var valorOrcamento = new BigDecimal("745.99");
        var qtdeItens = 3;

        var geraPedido = new GeraPedido(cliente, valorOrcamento, qtdeItens);
        var geraPedidoHandler = new GeraPedidoHandler(asList(new EnviarPedidoPorEmail(), new CriarPedidoNoBanco()));
        geraPedidoHandler.executar(geraPedido);
    }
}
