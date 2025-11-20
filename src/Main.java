import challenge1.Cercle;
import challenge1.Forme;
import challenge1.Rectangle;
import challenge2.Employe;
import challenge2.EmployeCommission;
import challenge2.EmployeHoraire;
import challenge3.Animal;
import challenge3.Chat;
import challenge3.Chien;
import challenge3.Vache;
import challenge6.Camion;
import challenge6.Moto;
import challenge6.Vehicule;
import challenge6.Voiture;
import challenge9.Document;
import challenge9.Image;
import challenge9.PDF;
import challenge9.Word;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public void main() {
//    Forme[] Formes = new  Forme[2];
//    Formes[0]=new Cercle(4);
//    Formes[1]=new Rectangle(3,7);
//
//    for(int i=0;i<Formes.length;i++){
//        System.out.println("AIR EST :"+Formes[i].calculerAire());
//    }


//    List<Employe> employes = new ArrayList<>();
//
//    employes.add(new Employe("hayat", 2000));
//    employes.add(new EmployeHoraire("sara", 1500, 40, 20));
//    employes.add(new EmployeCommission("nada", 1800, 5000, 0.05));
//
//    for (int i=0;i<employes.size();i++) {
//        System.out.println("Employé : " + employes.get(i).getNom() + " | Salaire : " + employes.get(i).calculerSalaire());
//    }

//    List<Animal> animal = new ArrayList<>();
//
//    animal.add(new Animal());
//    animal.add(new Chien());
//    animal.add(new Chat());
//    animal.add(new Vache());
//    for(int i=0;i<animal.size();i++){
//        animal.get(i).faireSon();
//    }


//    Document[] TABLE=new Document[3];
//    TABLE[0]=(new PDF());
//    TABLE[1]=new Word();
//    TABLE[2]=new Image();
//
//    for(int i=0;i< TABLE.length;i++){
//        TABLE[i].Afficher();
//    }


    Vehicule v1=new Voiture("AUDI","MB12");
    Vehicule v2= new Moto("BMW","EL24");
    Vehicule v3=new Camion("camion","CA95");

    v1.demarrer();
    v2.demarrer();
    v3.demarrer();



}

