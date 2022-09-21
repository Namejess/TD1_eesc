package models;

public class Bus extends Vehicule {

    private int nombreDePassager;

    public Bus(String marque, int nombreDePassager) {
        super(4, marque);
        this.nombreDePassager = nombreDePassager;
    }

    public int getNombreDePassager() {
        return nombreDePassager;
    }

    public void setNombreDePassager(int nombreDePassager) {
        this.nombreDePassager = nombreDePassager;
    }
}
