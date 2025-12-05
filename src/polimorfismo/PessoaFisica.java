package polimorfismo;

public class PessoaFisica extends pessoa {
    private int CPF;

    public PessoaFisica(String endereço, String nome, String telefone, int CPF) {
        super(endereço, nome, telefone);
        this.CPF = CPF;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void getgravar( String nome) {
        this.nome = nome;
        System.out.println("Nome gravado: " + this.nome);
    }

    public void getgravar(String nome, String endereço) {
        this.endereço = endereço;
        System.out.println("endereço gravado: " + this.endereço);

    }

    public void  getgravar(String nome,String telefone,String endereço) {
        this.telefone = telefone;
        System.out.println("teleofne gravado: " + this.telefone);
    }
    public void getgravar(String nome, String telefone, String endereço, int CPF) {
        this.CPF = CPF;
        System.out.println("CPF gravado: " + this.CPF);
    }

    public void gravar() {
    }
}
