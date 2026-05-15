package src.automoveis;

public class Seguro {
    private String seguradora;
    private String numeroApolice;
    private String telefoneAssistencia;

    public Seguro(String seguradora,
                  String numeroApolice,
                  String telefoneAssistencia){
        this.seguradora = seguradora;
        this.numeroApolice = numeroApolice;
        this.telefoneAssistencia = telefoneAssistencia;
    }

    public String getDadosSeguroFormatados() {
        return seguradora
                + " | Apólice "
                + numeroApolice
                + " | Assistência "
                + telefoneAssistencia;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public String getTelefoneAssistencia() {
        return telefoneAssistencia;
    }
}
