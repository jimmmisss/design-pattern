package br.com.observer.service.acoes;

import br.com.observer.model.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
