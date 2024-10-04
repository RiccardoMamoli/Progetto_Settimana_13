package riccardomamoli;

import riccardomamoli.exceptions.NoIdFoundExceptions;
import riccardomamoli.exceptions.SameIdExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Collezione {

    private List<GameBasicClass> tuttiGiochi;

    public Collezione () {
        this.tuttiGiochi = new ArrayList<>();
    }

    public void aggiungiGioco(GameBasicClass giocoSingolo) throws SameIdExceptions {
        for (GameBasicClass g : tuttiGiochi) {
            if (g.getId().equals(giocoSingolo.getId())) {
                throw new SameIdExceptions("L'ID " + giocoSingolo.getId() + " esiste già.");
            }
        }
        tuttiGiochi.add(giocoSingolo);
    }

    public void ricercaGioco(Integer id) throws NoIdFoundExceptions {
        Optional<GameBasicClass> giocoRicercatoID = tuttiGiochi.stream()
                .filter(g -> g.getId().equals(id)).findFirst();

        if (giocoRicercatoID.isPresent()) {
            System.out.println("----------------------------------------- ");
            System.out.println("Ecco il gioco da te richiesto: ");
            GameBasicClass giocoFiltratoID = giocoRicercatoID.get();
            System.out.println(" ");
            System.out.println("ID: " + giocoFiltratoID.getId() + "\nTitolo: " + giocoFiltratoID.getTitolo() + "\nPrezzo: " + giocoFiltratoID.getPrezzo());
            System.out.println(" ");
        } else {
            throw new NoIdFoundExceptions("Non esiste nessun gioco con questo ID.");
        }


    }

    public void stampaCollezione() {
        System.out.println("----------------------------------------- ");
        System.out.println(" ");
        System.out.println("Collezione completa: ");
        System.out.println(" ");
        tuttiGiochi.forEach(gioco ->
                        System.out.println
                                ("ID: " + gioco.getId() +
                                        "\nTitolo: " + gioco.getTitolo() +
                                        "\nAnno di pubblicazione: " + gioco.getAnnoPubblicazione() +
                                        "\nPrezzo: " + gioco.getPrezzo() + "\n"));
    }

    public List<GameBasicClass> filtraGiochi (double prezzo) {
      return tuttiGiochi.stream().filter(gioco -> gioco.getPrezzo() < prezzo)
               .collect(Collectors.toList());
    };


    public List<GameBasicClass> getTuttiGiochi() {
        return tuttiGiochi;
    }

    public void setTuttiGiochi(List<GameBasicClass> tuttiGiochi) {
        this.tuttiGiochi = tuttiGiochi;
    }
}
