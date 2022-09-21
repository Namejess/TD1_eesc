package models;

public class Voiture extends Vehicule {

    private int nombreDeChevaux;

    public Voiture(String marque, int nombreDeChevaux) {
        super(4, marque);
        this.nombreDeChevaux = nombreDeChevaux;
    }

    @Override
    public String info() {
        return "C'est une voiture à 4 roues";
    }

    public int getNombreDeChevaux() {
        return nombreDeChevaux;
    }

    public void setNombreDeChevaux(int nombreDeChevaux) {
        this.nombreDeChevaux = nombreDeChevaux;
    }

    public int fraisKilometrique(int kilometre){
        return kilometre * nombreDeChevaux * 34;

    }
}
