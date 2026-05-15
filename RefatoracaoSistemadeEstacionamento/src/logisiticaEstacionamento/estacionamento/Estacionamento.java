package src.logisiticaEstacionamento.estacionamento;

public class Estacionamento {

    private String nome;
    private String cnpj;
    private EnderecoEstacionamento enderecoEstacionamento;

    public Estacionamento(String nome,
                          String cnpj,
                          String rua,
                          String numero,
                          String bairro,
                          String cidade,
                          String estado,
                          String cep) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.enderecoEstacionamento = new EnderecoEstacionamento(rua,
                                                                 numero,
                                                                 bairro,
                                                                 cidade,
                                                                 estado,
                                                                 cep);
    }

    public void imprimirDados() {
        System.out.println("Estacionamento: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: "
                            + enderecoEstacionamento.getRua()
                            + ", "
                            + enderecoEstacionamento.getNumero()
                            + " - "
                            + enderecoEstacionamento.getBairro());
        System.out.println("Cidade: "
                            + enderecoEstacionamento.getCidade()
                            + " - "
                            + enderecoEstacionamento.getEstado());
        System.out.println("CEP: "
                            + enderecoEstacionamento.getCep());
    }


    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEnderecoCompleto(){
        return enderecoEstacionamento.getEnderecoCompleto();
    }

    public String getRua() {
        return enderecoEstacionamento.getRua();
    }

    public String getNumero() {
        return enderecoEstacionamento.getNumero();
    }

    public String getBairro() {
        return enderecoEstacionamento.getBairro();
    }

    public String getCidade() {
        return enderecoEstacionamento.getCidade();
    }

    public String getEstado() {
        return enderecoEstacionamento.getEstado();
    }

    public String getCep() {
        return enderecoEstacionamento.getCep();
    }
}
