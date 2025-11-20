package challenge6;

public class Vehicule {
    protected String marque;
    protected String modele;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void demarrer(){
        System.out.println("la vehicule démarrer");
    }
}
