package src.logisiticaEstacionamento.estacionamento;

import src.logisiticaEstacionamento.TicketEstacionamento;
import src.clientes.Cliente;
import java.math.BigDecimal;

public class RegistroPagamento {

    private TicketEstacionamento ticket;
    private Cliente cliente;
    private ValorMonetario valor;

    public RegistroPagamento(TicketEstacionamento ticket, Cliente cliente, ValorMonetario valor) {
        this.ticket = ticket;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void imprimirComprovante() {
        System.out.println("Pagamento do ticket: " + ticket.getCodigo());
        System.out.println("Cliente: " + cliente.getNome());

        System.out.println("Valor: " + valor.formatar());

        if (valor.isAltoValor()) {
            System.out.println("Classificação: pagamento de alto valor");
        } else {
            System.out.println("Classificação: pagamento comum");
        }
    }

    public TicketEstacionamento getTicket() {
        return ticket;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getValor() {
        return valor.getOriginal();
    }
}