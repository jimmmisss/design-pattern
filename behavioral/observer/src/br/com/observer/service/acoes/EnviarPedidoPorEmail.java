package br.com.observer.service.acoes;

import br.com.observer.model.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email para cliente sobre pedido!");
    }
}
