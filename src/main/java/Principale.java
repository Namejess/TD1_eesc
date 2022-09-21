import models.Bus;
import models.Vehicule;
import models.Voiture;

public class Principale {

    public static void main(String[] args) {

//        Vehicule monVehicule = new Vehicule(
//                2,
//                "Yamaha");

        Voiture maVoiture = new Voiture(
                "Toyoto",
                40);

        Bus monBus = new Bus(
                25,
                "Demler",
                12
        );


        System.out.println(maVoiture.info());
        System.out.println(monBus.info());




    }
}
