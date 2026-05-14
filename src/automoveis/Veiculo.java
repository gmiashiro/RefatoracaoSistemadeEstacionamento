package src.automoveis;

import src.logisiticaEstacionamento.TicketEstacionamento;

public class Veiculo {

    private String placa;
    private String modelo;
    private String cor;

    private Seguro seguro;
    private TicketEstacionamento ticketEstacionamento;

    public Veiculo(String placa,
                   String modelo,
                   String cor,
                   String seguradora,
                   String numeroApolice,
                   String telefoneAssistencia) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.seguro = new Seguro(seguradora, numeroApolice, telefoneAssistencia);
    }

    public void imprimirDados() {
        System.out.println("Veículo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
        System.out.println("Seguro: " + seguro.getDadosSeguroFormatados());
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getDadosSeguroFormatados(){
        return seguro.getDadosSeguroFormatados();
    }

    public String getSeguradora() {
        return seguro.getSeguradora();
    }

    public String getNumeroApolice() {
        return seguro.getNumeroApolice();
    }

    public String getTelefoneAssistencia() {
        return seguro.getTelefoneAssistencia();
    }

}
