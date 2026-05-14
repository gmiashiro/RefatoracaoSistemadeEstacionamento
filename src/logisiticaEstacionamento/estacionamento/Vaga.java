package src.logisiticaEstacionamento.estacionamento;

public class Vaga {

    private String codigo;
    private String setor;
    private boolean coberta;
    private boolean ocupada;

    public Vaga(String codigo, String setor, boolean coberta, boolean ocupada) {
        this.codigo = codigo;
        this.setor = setor;
        this.coberta = coberta;
        this.ocupada = ocupada;
    }

    public String descreverStatus() {
        if (this.ocupada && this.coberta) {
            return "ocupada e coberta";
        }

        if (this.ocupada) {
            return "ocupada";
        }

        if (this.coberta) {
            return "livre e coberta";
        }

        return "livre";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSetor() {
        return setor;
    }

    public boolean isCoberta() {
        return coberta;
    }

    public boolean isOcupada() {
        return ocupada;
    }
}