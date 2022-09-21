package models;

public abstract class Vehicule {

    protected int nombreDeRoue;

    protected String marque;

    public Vehicule(int nombreDeRoue, String marque) {
        this.nombreDeRoue = nombreDeRoue;
        this.marque = marque;
    }


    public abstract String info();

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

