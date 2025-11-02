package RelacionamentoClasses;

public class partidaFutebol {
    public void jogarPartida(Prantos time1, Prantos time2) {
    }

    // Classe que representa uma partida entre dois times
    public class PartidaDeFutebol {


        public void jogarPartida(Prantos time1, Prantos time2) {
            System.out.println(" PARTIDA ENTRE " + time1.getNome() + " E " + time2.getNome() );

            // Verifica a pontuação total dos dois times
            if (time1.getPontuacao() > time2.getPontuacao()) {
                System.out.println("Prantos " + time1.getNome() + " venceu a partida!");
            } else if (time2.getPontuacao() > time1.getPontuacao()) {
                System.out.println("Lamento " + time2.getNome() + " venceu a partida!");
            } else {
                System.out.println(" Empate entre " + time1.getNome() + " e " + time2.getNome());
            }


        }
    }



}



