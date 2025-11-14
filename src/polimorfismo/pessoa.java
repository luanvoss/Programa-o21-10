package polimorfismo;

public class pessoa {

    protected String nome;
    protected String endereço;
    protected String telefone;

    public pessoa(String endereço, String nome, String telefone) {
        this.endereço = endereço;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", endereço='" + endereço + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
