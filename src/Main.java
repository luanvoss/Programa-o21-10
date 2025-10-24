import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Moldegarrafa garrafaTransparente = new Moldegarrafa();

        garrafaTransparente.cor = "Transparente";
        garrafaTransparente.carga = 100;
        garrafaTransparente.tampada = false;
        garrafaTransparente.modelo = "Isotonico ";
        garrafaTransparente.status();

        garrafaTransparente.tampada = true;
        garrafaTransparente.status();

        garrafaTransparente.beber();
        garrafaTransparente.destampar();
        garrafaTransparente.beber();
        garrafaTransparente.beber();

    }
}




