package riccardomamoli;

import riccardomamoli.exceptions.SameIdExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<GameBasicClass> getTuttiGiochi() {
        return tuttiGiochi;
    }

    public void setTuttiGiochi(List<GameBasicClass> tuttiGiochi) {
        this.tuttiGiochi = tuttiGiochi;
    }
}
