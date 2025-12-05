package Herança;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está vendendo produtos e ganhou R$ " + comissao + " de comissão.");
}

}
