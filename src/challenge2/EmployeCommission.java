package challenge2;

public class EmployeCommission extends Employe{
    private double vente;
    private double commission;

    public EmployeCommission(String nom, double salaireBase, double vente, double commission) {
        super(nom, salaireBase);
        this.vente = vente;
        this.commission = commission;
    }

    public double getVente() {
        return vente;
    }

    public void setVente(double vente) {
        this.vente = vente;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    public double calculerSalaire() {
        return salaireBase + (vente*commission);
    }
}
