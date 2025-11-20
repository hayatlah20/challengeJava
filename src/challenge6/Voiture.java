package challenge6;

public class Voiture extends Vehicule{
    public Voiture(String marque, String modele) {
        super(marque, modele);
    }

    public void demarrer() {
        System.out.println("la voiture " +marque+ " " +modele+ " elle est démarrer");

    }
}
