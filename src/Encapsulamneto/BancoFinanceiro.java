package Encapsulamneto;

import java.util.Scanner;

public class BancoFinanceiro {

    private String Banco;
    private double Saque;
    private double Deposito;
    private double Saldo;
    private String Conta;

    public double getSaque() {
        return Saque;
    }

    public void setSaque(double saque) {
        Saque = saque;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String banco) {
        Banco = banco;
    }

    public double getDeposito() {
        return Deposito;
    }

    public void setDeposito(double deposito) {
        Deposito = deposito;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String getConta() {
        return Conta;
    }

    public void setConta(String conta) {
        Conta = conta;
    }

    public BancoFinanceiro() {

    }
    public double getstatus(){
        return Saldo;
    }
    public void setDepositar(){
        Scanner sc = new Scanner(System.in);

    System.out.println("Qual o valor de deposito?");
    double valor = sc.nextDouble();

    Saldo += valor;

    System.out.println("Deposito de R$ : "+valor);
    System.out.println("Saldo atual: "+Saldo + "mais");
    }
    public void setsacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor que deseja sacar?");
        double Valor = sc.nextDouble();
        if (Valor > Saldo){
            System.out.println("Saldo insuficiente");
        } else {
            Saldo -= Valor;
            System.out.println("Saque de R$:" + Valor );
            System.out.println("Saldo atual R$" +Saldo);
        }
    }
}
