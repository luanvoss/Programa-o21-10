package polimorfismo;

public class contaComum {
    private int numero;
    private  int saldo;
    private int tipo;

    public contaComum(int saldo, int numero, int tipo) {
        this.saldo = saldo;
        this.numero = numero;
        this.tipo = tipo;
    }

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

    public  void getsacar(){
        if(saldo <= 0){
            System.out.println("Saldo insuficiente ");
        } else {
            System.out.println("Você sacou: " +this.saldo);
        }
    }

    public  void getdepositar(){
       System.out.println("Você depositou R$: " +this.saldo);
    }
}
