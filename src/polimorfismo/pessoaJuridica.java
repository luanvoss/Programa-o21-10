package polimorfismo;

public class pessoaJuridica extends pessoa {
    private String CNPJ;

    public pessoaJuridica(String endereço, String nome, String telefone, String CNPJ) {
        super(endereço, nome, telefone);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void getgravar(String nome) {
        this.nome = nome;
        System.out.println("Nome gravado: " + this.nome);
    }

    public void getgravar(String nome, String endereço) {
        this.endereço = endereço;
        System.out.println("endereço gravado: " + this.endereço);

    }

    public void getgravar(String nome, String telefone, String endereço) {
        this.telefone = telefone;
        System.out.println("teleofne gravado: " + this.telefone);
    }

    public void getgravar(String nome, String telefone, String endereço, String CNPF) {
        this.CNPJ = CNPJ;
        System.out.println("CPF gravado: " + this.CNPJ);

    }
}
