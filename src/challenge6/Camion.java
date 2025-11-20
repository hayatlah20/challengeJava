package challenge6;

public class Camion extends Vehicule{
    public Camion(String marque, String modele) {
        super(marque, modele);
    }

    public void demarrer() {
        System.out.println("le camion " +marque+ " " +marque+ " il est démarrer");

    }
}
