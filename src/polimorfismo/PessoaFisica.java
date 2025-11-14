package polimorfismo;

public class PessoaFisica extends pessoa {
    private String CPF;

    public PessoaFisica(String endereço, String nome, String telefone, String CPF) {
        super(endereço, nome, telefone);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
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
    public void getgravar(String nome, String telefone, String endereço, String CPF) {
        this.CPF = CPF;
        System.out.println("CPF gravado: " + this.CPF);
    }
}
