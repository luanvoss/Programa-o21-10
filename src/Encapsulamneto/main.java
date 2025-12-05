package Encapsulamneto;

public class main {
    public static void main(String[] args){
        BancoFinanceiro banquinho = new BancoFinanceiro();
        banquinho.setDepositar();
        banquinho.setsacar();
        System.out.println("Saldo final R$: " +banquinho.getstatus());
    }
}
