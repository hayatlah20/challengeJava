package challenge1;

public class Cercle extends Forme{
        int rayon;
        public Cercle(int rayon) {
            this.rayon = rayon;
        }

        public int getRayon() {
            return rayon;
        }

        public void setRayon(int rayon) {
            this.rayon = rayon;
        }

        public double calculerAire(){
            return Math.PI*rayon*rayon;
        }
}
