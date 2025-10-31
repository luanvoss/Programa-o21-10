public class Prantos {
    private String time;
    private String patrocionadora;
    private int fundação;
    private int posição;
    private int partidasVencidas;
    private int partidasPerdidas;
    private int partidasEmpatadas;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPatrocionadora() {
        return patrocionadora;
    }

    public void setPatrocionadora(String patrocionadora) {
        this.patrocionadora = patrocionadora;
    }

    public int getFundação() {
        return fundação;
    }

    public void setFundação(int fundação) {
        this.fundação = fundação;
    }

    public int getPosição() {
        return posição;
    }

    public void setPosição(int posição) {
        this.posição = posição;
    }

    public int getPartidasVencidas() {
        return partidasVencidas;
    }

    public void setPartidasVencidas(int partidasVencidas) {
        this.partidasVencidas = partidasVencidas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getPartidasEmpatadas() {
        return partidasEmpatadas;
    }

    public void setPartidasEmpatadas(int partidasEmpatadas) {
        this.partidasEmpatadas = partidasEmpatadas;
    }

    public Prantos(String time, String patrocionadora, int fundação, int posição, int partidasVencidas, int partidasPerdidas, int partidasEmpatadas) {
        this.time = time;
        this.patrocionadora = patrocionadora;
        this.fundação = fundação;
        this.posição = posição;
        this.partidasVencidas = partidasVencidas;
        this.partidasPerdidas = partidasPerdidas;
        this.partidasEmpatadas = partidasEmpatadas;





    }
}
