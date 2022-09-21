package models;

public class Bus extends Vehicule {

    private int nombreDePassager;

    public Bus(int nombreDeRoue, String marque, int nombreDePassager) {
        super(nombreDeRoue, marque);
        this.nombreDePassager = nombreDePassager;
    }

    public int coutMaintenanceRoue(int nombreDeRoue){
        return nombreDeRoue * 500;
    }
    @Override
    public String info() {
        return "Ceci est un bus de " + nombreDePassager + " passagers";
    }

    public int getNombreDePassager() {
        return nombreDePassager;
    }

    public void setNombreDePassager(int nombreDePassager) {
        this.nombreDePassager = nombreDePassager;
    }
}


