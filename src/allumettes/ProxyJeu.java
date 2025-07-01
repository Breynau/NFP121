package allumettes;

public class ProxyJeu extends Jeu {
    private Jeu jeu;

    public ProxyJeu(Jeu jeu) {
        super(jeu.getNombreAllumettes());
        this.jeu = jeu;
    }

    @Override
    public void retirer(int nb) throws CoupInvalideException {
        throw new OperationInterditeException("Retirer interdit via Proxy !");
    }

    @Override
    public int getNombreAllumettes() {
        return jeu.getNombreAllumettes();
    }

    @Override
    public String toString() {
        return jeu.toString();
    }
}
