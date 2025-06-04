package interfaces.Ex01.domain;

import interfaces.Ex01.Interface.Pagamento;

public class CartaoCredito implements Pagamento{
    
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
    }
}
