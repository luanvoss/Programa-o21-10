package RelacionamentoClasses;

public class Prantos {
    // Atributos do time
    private String nome;
    private String patrocinadora;
    private int fundacao;
    private int posicao;
    private int partidasVencidas;
    private int partidasPerdidas;
    private int partidasEmpatadas;


    public Prantos(String nome, String patrocinadora, int fundacao, int posicao,
                   int partidasVencidas, int partidasPerdidas, int partidasEmpatadas) {
        this.nome = nome;
        this.patrocinadora = patrocinadora;
        this.fundacao = fundacao;
        this.posicao = posicao;
        this.partidasVencidas = partidasVencidas;
        this.partidasPerdidas = partidasPerdidas;
        this.partidasEmpatadas = partidasEmpatadas;
    }

    // ==== GETTERS ====
    public String getNome() {
        return nome;
    }

    public String getPatrocinadora() {
        return patrocinadora;
    }

    public int getFundacao() {
        return fundacao;
    }

    public int getPosicao() {
        return posicao;
    }

    public int getPartidasVencidas() {
        return partidasVencidas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public int getPartidasEmpatadas() {
        return partidasEmpatadas;
    }

    // ==== SETTERS ====
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPatrocinadora(String patrocinadora) {
        this.patrocinadora = patrocinadora;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setPartidasVencidas(int partidasVencidas) {
        this.partidasVencidas = partidasVencidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public void setPartidasEmpatadas(int partidasEmpatadas) {
        this.partidasEmpatadas = partidasEmpatadas;
    }

    public int getPontuacao() {
        return calcularPontuacao();
    }

    public int calcularPontuacao() {
        return (partidasVencidas * 3) + partidasEmpatadas;
    }


    public void exibirInformacoes() {
        System.out.println("Time: " + nome);
        System.out.println("Patrocinadora: " + patrocinadora);
        System.out.println("Ano de Fundação: " + fundacao);
        System.out.println("Posição: " + posicao);
        System.out.println("Vitórias: " + partidasVencidas);
        System.out.println("Empates: " + partidasEmpatadas);
        System.out.println("Derrotas: " + partidasPerdidas);
        System.out.println("Pontuação total: " + calcularPontuacao());

    }
}


