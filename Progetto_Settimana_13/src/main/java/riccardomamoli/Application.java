package riccardomamoli;

import riccardomamoli.exceptions.SameIdExceptions;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        Collezione collezione = new Collezione();


        Videogame videogame1 = new Videogame(1, "NBA 2k22", 2021, 24.95, "PS4", 150, Generi.SPORT );
        Videogame videogame2 = new Videogame(2, "FC2025", 2024, 84.00, "PS4", 200, Generi.SPORT );
        Videogame videogame3 = new Videogame(3, "MADDEN NFL 24", 2023, 30.75, "XBOX", 150, Generi.SPORT );
        Videogame videogame4 = new Videogame(4, "FINAL FANTASY XVI", 2023, 38.95, "XBOX", 50, Generi.RPG );
        Videogame videogame5 = new Videogame(5, "KINGDOM HEARTS III", 2019, 25.95, "PS4", 50, Generi.RPG );

       try {
           collezione.aggiungiGioco(videogame1);
           collezione.aggiungiGioco(videogame2);
           collezione.aggiungiGioco(videogame3);

           System.out.println("----------------------------------------- ");
           System.out.println(" ");
           System.out.println("Collezione completa: ");
           System.out.println(" ");
           collezione.getTuttiGiochi()
                   .forEach(gioco ->
                           System.out.println("Titolo: " + gioco.getTitolo() + "\nAnno di pubblicazione: " + gioco.getAnnoPubblicazione() + "\nPrezzo: " + gioco.getPrezzo() + "\n"));

       } catch (SameIdExceptions e) {
           System.out.println(e.getMessage());
       }
    }
}
