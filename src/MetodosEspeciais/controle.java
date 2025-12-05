package MetodosEspeciais;

public class controle {
    private String modelo;
    private String cor;
    private boolean botao_on_of;
    private int botao_Velocidade;
    private int botao_menosVelocidade;



    public controle(String modelo, String cor, boolean botao_ON_OF, int botao_aumentaVelocidade, int botao_diminuiVelocidade) {
        this.modelo = modelo;
        this.cor = cor;
        this.botao_on_of = botao_on_of;
        this.botao_Velocidade = botao_Velocidade;
        this.botao_menosVelocidade = botao_menosVelocidade;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isBotao_ON_OF() {
        return botao_on_of;
    }

    public void setBotao_ON_OF(boolean botao_ON_OF) {
        this.botao_on_of = botao_on_of;
    }

    public int getBotao_aumentaVelocidade() {
        return botao_Velocidade;
    }

    public void setBotao_aumentaVelocidade(int botao_aumentaVelocidade) {
        this.botao_Velocidade = botao_aumentaVelocidade;
    }

    public int getBotao_diminuiVelocidade() {
        return botao_menosVelocidade;
    }

    public void setBotao_diminuiVelocidade(int botao_diminuiVelocidade) {
        this.botao_menosVelocidade = botao_diminuiVelocidade;
    }
}

