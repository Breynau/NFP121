package allumettes;

public class Rapide implements Strategie {
    private String nom;

    public Rapide(String nom) {
        this.nom = nom;
    }

    @Override
    public int getPrise(Jeu jeu) {
        return Math.min(Jeu.MAX_PRISE, jeu.getNombreAllumettes());
    }

    @Override
    public String getNom() {
        return nom;
    }
}
