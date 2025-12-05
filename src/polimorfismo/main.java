package polimorfismo;

public class main {
    public static void main(String[] args) {

        System.out.println(" TESTE DE PESSOA FÍSICA ");
        PessoaFisica pf = new PessoaFisica("Luan", "Rua A, 123", "9999-8888", 123456789);
        pf.gravar();

        System.out.println("\nTESTE DE PESSOA JURÍDICA ");
        pessoaJuridica pj = new pessoaJuridica("Loja XPTO", "Av. Central, 500", "3333-2222", 55667788);
        pj.gravar();

        System.out.println("\n TESTE DE CONTA COMUM ");
        contaComum conta1 = new contaComum(500, 1, 1);
        conta1.depositar(200);
        conta1.sacar(100);

        System.out.println("\n TESTE DE CONTA ESPECIAL ");
        especial contaEsp = new especial(300,2,2,500);
        contaEsp.sacar(600);   // usa parte do limite
        contaEsp.depositar(50);

        System.out.println("\n TESTE DE CONTA POUPANÇA ");
        poupança contaPoup = new poupança(1000, 3, 3, 20);
        contaPoup.depositar(200);
        contaPoup.sacar(300);

        System.out.println("\n= HISTÓRICO DA CONTA ESPECIAL ");
        contaEsp.getHistorico().imprimirHistórico();

}


}
