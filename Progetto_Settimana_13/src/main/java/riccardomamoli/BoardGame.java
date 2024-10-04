package riccardomamoli;

public class BoardGame extends GameBasicClass {
    private Integer numGiocatori;
    private double durataPartita;

    public BoardGame(Integer numGiocatori, double durataPartita, Integer id, String titolo, Integer annoPubblicazione, double prezzo) {
        super(id, titolo, annoPubblicazione, prezzo);
        this.numGiocatori = numGiocatori;
        this.durataPartita = durataPartita;
    }

    public Integer getNumGiocatori() {
        return numGiocatori;
    }

    public void setNumGiocatori(Integer numGiocatori) {
        this.numGiocatori = numGiocatori;
    }

    public double getDurataPartita() {
        return durataPartita;
    }

    public void setDurataPartita(double durataPartita) {
        this.durataPartita = durataPartita;
    }

    @Override
    public String toString() {
        return "BoardGame{" +
                "numGiocatori=" + numGiocatori +
                ", durataPartita=" + durataPartita +
                '}';
    }
}
