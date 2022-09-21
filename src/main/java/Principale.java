import models.Bus;
import models.Garage;
import models.Vehicule;
import models.Voiture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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


        Garage superGarage = new Garage("Super garage");

        Voiture reno = new Voiture(
                "Reno",
                35);

        Voiture rena = new Voiture(
                "Reno",
                35);

        superGarage.ajoutVoiture(reno, rena);

        HashSet<Voiture> listeVoiture2 = new HashSet<>();

        listeVoiture2.add(reno);
        listeVoiture2.add(reno);
        listeVoiture2.add(new Voiture("Boby", 35));

        HashMap<String, Voiture> mapVoiture = new HashMap<>();
        mapVoiture.put("reno", reno);
        mapVoiture.put("Mini", new Voiture(
                "Mini",
                34));

        System.out.println(mapVoiture.get("Mini").getNombreDeChevaux());


    }
}
