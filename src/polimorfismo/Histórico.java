package polimorfismo;

public class Histórico {
    public void gravar(int numero, int tipo, String saque, int valor, int saldo) {
    }

    public void imprimirHistórico() {

    }

    public class Historico {
        private int numeroConta;
        private int tipoConta;

        public void gravar(int numeroConta, int tipoConta) {
            this.numeroConta = numeroConta;
            this.tipoConta = tipoConta;
            System.out.println("Operação registrada no histórico!");
}
    }
}
