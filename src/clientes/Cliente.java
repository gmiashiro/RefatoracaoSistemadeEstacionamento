package src.clientes;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private int pontosFidelidade;
    private int mesesComoCliente;
    private boolean mensalista;
    private CobrancaCliente cobrancaCliente;

    public Cliente(String nome,
                   String cpf,
                   String telefone,
                   int pontosFidelidade,
                   int mesesComoCliente,
                   boolean mensalista,
                   String banco,
                   String agencia,
                   String conta,
                   String metodoPagamentoPreferencial) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.pontosFidelidade = pontosFidelidade;
        this.mesesComoCliente = mesesComoCliente;
        this.mensalista = mensalista;
        this.cobrancaCliente = new CobrancaCliente(banco,
                agencia,
                conta,
                metodoPagamentoPreferencial);
    }

    public void imprimirResumo() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Pontos de fidelidade: " + pontosFidelidade);
        System.out.println("Mensalista: " + mensalista);
        System.out.println("Cobrança: " + getDadosCobrancaFormatados());
    }

    public int calcularDescontoCliente() {
        if (this.mensalista && this.pontosFidelidade >= 4000) {
            return 20;
        }

        if (this.mesesComoCliente >= 12 && this.pontosFidelidade >= 2000) {
            return 10;
        }

        if (this.pontosFidelidade >= 1000) {
            return 5;
        }

        return 0;
    }

    public String getDadosCobrancaFormatados() {
        return cobrancaCliente.getDadosCobrancaFormatados();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public int getMesesComoCliente() {
        return mesesComoCliente;
    }

    public boolean isMensalista() {
        return mensalista;
    }

    public String getBanco() {
        return cobrancaCliente.getBanco();
    }

    public String getAgencia() {
        return cobrancaCliente.getAgencia();
    }

    public String getConta() {
        return cobrancaCliente.getConta();
    }

    public String getMetodoPagamentoPreferencial() {
        return cobrancaCliente.getMetodoPagamentoPreferencial();
    }
}