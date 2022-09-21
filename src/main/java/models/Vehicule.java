package models;

public class Vehicule {

    private static final int nombreDeRoue = 4;

    private String marque;

    public Vehicule(int nombreDeRoue, String marque) {
        this.marque = marque;
    }

    public String info(){
        return "Véhicule sans catégorie à " + nombreDeRoue + " roues";
    }

    public int getNombreDeRoue() {
        return nombreDeRoue;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}

