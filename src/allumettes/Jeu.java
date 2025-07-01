package allumettes;

public class Jeu {
    public static final int MAX_PRISE = 3;
    private int allumettes;

    public Jeu(int allumettes) {
        this.allumettes = allumettes;
    }

    public int getNombreAllumettes() {
        return this.allumettes;
    }

    public void retirer(int nb) throws CoupInvalideException {
        if (nb < 1 || nb > MAX_PRISE || nb > allumettes) {
            throw new CoupInvalideException("Nombre invalide : " + nb);
        }
        allumettes -= nb;
    }

    @Override
    public String toString() {
        return "Allumettes restantes : " + allumettes;
    }
}
