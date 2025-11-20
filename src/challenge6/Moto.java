package challenge6;

public class Moto extends Vehicule{
    public Moto(String marque, String modele) {
        super(marque, modele);
    }

    public void demarrer() {
        System.out.println("le moto " +marque+ " " +modele+ " il est démarrer");

    }
}
