package classe;

import java.util.HashMap;
import java.util.Map;

public class MaquinaEstacionamento {
    double saldoTotal;
    int contadorTickets;
    Map<Integer, Ticket> ticketsEmitidos;

    MaquinaEstacionamento() {
        this.saldoTotal = 0.0;
        this.contadorTickets = 1;
        this.ticketsEmitidos = new HashMap<>();
    }

    // Emite um ticket com valor de R$ 5,00
    void emitirTicket() {
        Ticket novoTicket = new Ticket(contadorTickets);
        ticketsEmitidos.put(contadorTickets, novoTicket);
        System.out.println("Ticket emitido: #" + contadorTickets + " - Valor: R$ " + novoTicket.obterValor());
        contadorTickets++;
    }

    // Recebe o pagamento de um ticket com base no número do ticket
    void pagarTicket(int numeroTicket) {
        Ticket ticket = ticketsEmitidos.get(numeroTicket);
        if (ticket != null && !ticket.jaPago()) {
            ticket.pagar();
            saldoTotal += ticket.obterValor();
            System.out.println("Ticket #" + numeroTicket + " foi pago.");
        } else if (ticket != null && ticket.jaPago()) {
            System.out.println("Ticket #" + numeroTicket + " já foi pago.");
        } else {
            System.out.println("Ticket #" + numeroTicket + " não encontrado.");
        }
    }

    // Exibe o saldo total das operações
    double consultarSaldo() {
        return saldoTotal;
    }
}


