package Herança;

public class MAIN {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Luan", 8000.0, "TI");
        Vendedor v1 = new Vendedor("João", 2500.0, 350.0);
        Estagiario e1 = new Estagiario("Lucas", 1200.0, 6);

        g1.trabalhar();
        v1.trabalhar();
        e1.trabalhar();
}
}
