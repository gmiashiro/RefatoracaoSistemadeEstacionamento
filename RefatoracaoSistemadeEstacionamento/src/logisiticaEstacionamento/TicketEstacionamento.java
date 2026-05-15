package src.logisiticaEstacionamento;

import src.logisiticaEstacionamento.estacionamento.Vaga;
import src.automoveis.Veiculo;
import src.logisiticaEstacionamento.estacionamento.DataHoraEstacionamento;

import java.time.Duration;
import java.time.LocalDateTime;

public class TicketEstacionamento {

    private String codigo;
    private Veiculo veiculo;
    private Vaga vaga;
    private boolean perdido;

    private DataHoraEstacionamento entrada;
    private DataHoraEstacionamento saidaPrevista;

    public TicketEstacionamento(String codigo,
                                Veiculo veiculo,
                                Vaga vaga,
                                boolean perdido,
                                LocalDateTime dataHoraEntrada,
                                LocalDateTime dataHoraSaidaPrevista) {
        this.codigo = codigo;
        this.veiculo = veiculo;
        this.vaga = vaga;
        this.perdido = perdido;
        this.entrada = new DataHoraEstacionamento(dataHoraEntrada);
        this.saidaPrevista = new DataHoraEstacionamento(dataHoraSaidaPrevista);
    }

    public void imprimirTicket() {
        System.out.println("Ticket: " + codigo);
        System.out.println("Veículo: " + veiculo.getPlaca());
        System.out.println("Vaga: " + vaga.getCodigo());

        System.out.println("Entrada registrada: " + entrada.formatar());
        System.out.println("Saída prevista: " + saidaPrevista.formatar());

        if (entrada.isHorarioEspecial()) {
            System.out.println("Período: horário especial");
        } else {
            System.out.println("Período: horário regular");
        }

        if (perdido) {
            System.out.println("Situação: ticket perdido");
        } else {
            System.out.println("Situação: ticket regular");
        }
    }

    public long calcularMinutosPermanencia() {
        return Duration.between(
                this.entrada.getOriginal(),
                this.saidaPrevista.getOriginal()).toMinutes();
    }

    public String getCodigo() {
        return codigo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public boolean isPerdido() {
        return perdido;
    }

    public LocalDateTime getDataHoraEntrada() {
        return entrada.getOriginal();
    }

    public LocalDateTime getDataHoraSaidaPrevista() {
        return saidaPrevista.getOriginal();
    }
}