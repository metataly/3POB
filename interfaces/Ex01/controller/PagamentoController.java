package interfaces.Ex01.controller;

import interfaces.Ex01.Interface.Pagamento;
import interfaces.Ex01.domain.BoletoBancario;
import interfaces.Ex01.domain.CartaoCredito;

public class PagamentoController {
    public static void main(String[] args) {

        Pagamento pagamentoCartao = new CartaoCredito();
        Pagamento pagamentoBoleto = new BoletoBancario();

        pagamentoCartao.realizarPagamento(150.00);
        pagamentoBoleto.realizarPagamento(320.50);
    }
}

