import models.Bus;
import models.Personne;
import models.Vehicule;
import models.Voiture;

import java.util.Arrays;

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

        final Voiture voiture2 = new Voiture(
                "Reno",
                40
        );


        Bus bus = new Bus(
                6,
                "Demler",
                14);


        System.out.println(bus.coutMaintenanceRoue(50));


    }
}
