package src.logisiticaEstacionamento;

import src.logisiticaEstacionamento.estacionamento.Vaga;
import src.automoveis.Veiculo;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

public class TicketEstacionamento {

    private String codigo;
    private Veiculo veiculo;
    private Vaga vaga;
    private boolean perdido;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaidaPrevista;

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
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaidaPrevista = dataHoraSaidaPrevista;
    }

    public void imprimirTicket() {
        LocalDateTime entrada = dataHoraEntrada;
        LocalDateTime saida = dataHoraSaidaPrevista;

        String entradaFormatada = entrada.getDayOfMonth() + "/"
                + entrada.getMonthValue() + "/"
                + entrada.getYear() + " "
                + entrada.getHour() + ":"
                + String.format("%02d", entrada.getMinute());

        String saidaFormatada = saida.getDayOfMonth() + "/"
                + saida.getMonthValue() + "/"
                + saida.getYear() + " "
                + saida.getHour() + ":"
                + String.format("%02d", saida.getMinute());


        System.out.println("Ticket: " + codigo);
        System.out.println("Veículo: " + veiculo.getPlaca());
        System.out.println("Vaga: " + vaga.getCodigo());
        System.out.println("Entrada registrada: " + entradaFormatada);
        System.out.println("Saída prevista: " + saidaFormatada);

        if (entrada.getDayOfWeek() == DayOfWeek.SATURDAY
                || entrada.getDayOfWeek() == DayOfWeek.SUNDAY
                || entrada.getHour() < 7
                || entrada.getHour() >= 22) {
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
                this.dataHoraEntrada,
                this.dataHoraSaidaPrevista).toMinutes();
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
        return dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaidaPrevista() {
        return dataHoraSaidaPrevista;
    }
}