package polimorfismo;

public class especial extends contaComum {

    private int numero;
    private int saldo;
    private int tipo;

    // associação com Histórico (a conta registra operações)
    private Histórico historico;

    public especial(int saldo, int numero, int tipo, int i) {
        super(saldo, numero, tipo);
    }

    public void ContaComum(int saldo, int numero, int tipo) {
        this.saldo = saldo;
        this.numero = numero;
        this.tipo = tipo;
        this.historico = new Histórico(); // cria um histórico próprio
    }

    // getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Histórico getHistorico() {
        return historico;
    }

    public void setHistorico(Histórico historico) {
        this.historico = historico;
    }

    // método público sacar : void
    public void sacar(int valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
            System.out.println("Saldo atual: " + saldo);
            // registra no histórico
            historico.gravar(numero, tipo, "SAQUE", valor, saldo);
        }
    }

    // método público depositar : void
    public void depositar(int valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito realizado: " + valor);
        System.out.println("Saldo atual: " + saldo);
        // registra no histórico
        historico.gravar(numero, tipo, "DEPOSITO", valor,saldo);
}

}


