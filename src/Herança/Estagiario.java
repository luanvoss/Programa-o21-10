package Herança;

public class Estagiario extends Funcionario{
    private int horasTrabalho;

    public Estagiario(String nome, double salario, int horasTrabalho) {
        super(nome, salario);
        this.horasTrabalho = horasTrabalho;
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando por " + horasTrabalho + " horas.");
}
}
