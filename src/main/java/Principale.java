import models.Bus;
import models.Vehicule;
import models.Voiture;

public class Principale {

    public static void main(String[] args) {

        Vehicule peugeot = new Vehicule(
                4,
                "peugeot");

        Voiture maVoiture = new Voiture(
                "peugeot",
                355
        );

        Bus bus = new Bus(
                "Demler",
                15);

        System.out.println(voiture.fraisKilometrique(40));

    }
}
