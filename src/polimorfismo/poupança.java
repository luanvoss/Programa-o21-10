package polimorfismo;

public class poupança extends contaComum{
    private int dataaniversario;

    public poupança(int saldo, int numero, int tipo, int dataaniversario) {
        super(saldo, numero, tipo);
        this.dataaniversario = dataaniversario;
    }

    public int getDataaniversario() {
        return dataaniversario;
    }

    public void setDataaniversario(int dataaniversario) {
        this.dataaniversario = dataaniversario;
    }

    public void depositar(int i) {
    }

    public void sacar(int i) {

    }
}
