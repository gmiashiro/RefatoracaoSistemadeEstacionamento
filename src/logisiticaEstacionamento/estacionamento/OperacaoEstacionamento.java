package src.logisiticaEstacionamento.estacionamento;

import src.logisiticaEstacionamento.TicketEstacionamento;

import java.time.Duration;

public class OperacaoEstacionamento {

    public long calcularMinutosPermanencia(TicketEstacionamento ticket) {
        return Duration.between(
                ticket.getDataHoraEntrada(),
                ticket.getDataHoraSaidaPrevista()).toMinutes();
    }
}
