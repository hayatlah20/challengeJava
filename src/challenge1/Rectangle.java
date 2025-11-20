package challenge1;

public class Rectangle extends Forme{
    double Largeur;
    double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.Largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return Largeur;
    }

    public void setLargeur(double largeur) {
        Largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double calculerAire() {
        return hauteur*Largeur;
    }
}
