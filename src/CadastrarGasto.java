public class CadastrarGasto {
    private String nome;
    private double valor;
    private String tipoGasto;
    private String meioDePagamento;
    private String dataDoGasto;


    public CadastrarGasto(String nome, double valor, String tipoGasto, String meioDePagamento, String dataDoGasto) {
        this.nome = nome;
        this.valor = valor;
        this.tipoGasto = tipoGasto;
        this.meioDePagamento = meioDePagamento;
        this.dataDoGasto = dataDoGasto;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public String getMeioDePagamento() {
        return meioDePagamento;
    }

    public void setMeioDePagamento(String meioDePagamento) {
        this.meioDePagamento = meioDePagamento;
    }

    public String getDataDoGasto() {
        return dataDoGasto;
    }

    public void setDataDoGasto(String dataDoGasto) {
        this.dataDoGasto = dataDoGasto;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nGasto cadastrado: ");
        stringBuilder.append("\nNome: " + getNome());
        stringBuilder.append("\nValor: " + getValor());
        stringBuilder.append("\nTipo de gasto: " + getTipoGasto());
        stringBuilder.append("\nMeio de pagamento: " + getMeioDePagamento());
        stringBuilder.append("\nData do gasto: " + getDataDoGasto());
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
