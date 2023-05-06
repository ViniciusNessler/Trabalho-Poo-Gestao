public class CadastrarGanho {
    private double valor;
    private String nomeGanho;
    private String dataGanho;

    public CadastrarGanho(double valor, String nomeGanho, String dataGanho) {
        this.valor = valor;
        this.nomeGanho = nomeGanho;
        this.dataGanho = dataGanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeGanho() {
        return nomeGanho;
    }

    public void setNomeGanho(String nomeGanho) {
        this.nomeGanho = nomeGanho;
    }

    public String getDataGanho() {
        return dataGanho;
    }

    public void setDataGanho(String dataGanho) {
        this.dataGanho = dataGanho;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nGanho cadastrado: ");
        stringBuilder.append("\nNome: " + getNomeGanho());
        stringBuilder.append("\nValor: " + getValor());
        stringBuilder.append("\nData: " + getDataGanho());
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
