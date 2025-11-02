package RelacionamentoClasses;

public class main {

    public static void main(String[] args) {
                // Cria dois objetos da classe Prantos (times)
                Prantos time1 = new Prantos("Prantos FC", "Nike", 1990, 1, 10, 3, 2);
                Prantos time2 = new Prantos("Real Voss", "Adidas", 1985, 2, 8, 4, 3);


                System.out.println("=== INFORMAÇÕES DOS TIMES ===");
                time1.exibirInformacoes();
                time2.exibirInformacoes();


                partidaFutebol partida = new partidaFutebol();

                System.out.println("=== RESULTADO DA PARTIDA ===");
                partida.jogarPartida(time1, time2);
            }
        }




