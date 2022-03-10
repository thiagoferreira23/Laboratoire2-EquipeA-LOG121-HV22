package Framework;

/**
 * <p>Description de la classe</p>
 *
 * @author Franco Huynh, Gabriel M. Borges & Thiago Ferreira
 * @version 1.0
 * @since 2022-02-24 9:26 a.m.
 */
public class FabriqueJeu {
    public void initialiserJeu(int nbJoueur, int nbDeParJoueur, int nbFaceDe, int nbTour, IStrategie regleJeu) {

    }

    public void creerJoueur(int nbJoueur) {

    }

    public void creerDe(int nbFaceDe, int nbDeParJoueur) {

    }

    public void jouer() {

    }

    public final void creerJeuBunco(int nbJoueur, int nbDeParJoueur, int nbFaceDe, int nbTour, IStrategie regleJeu) {
        initialiserJeu(nbJoueur, nbDeParJoueur, nbFaceDe, nbTour, regleJeu);
        creerJoueur(nbJoueur);
        creerDe(nbFaceDe, nbDeParJoueur);
        jouer();
    }
}