package main;

import shablon.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, InformationForCar> hashMapCar = new HashMap<>();
        hashMapCar.put(new Car(12349856, 999), new InformationForCar(2020, "Chevrolet Camaro", 200000, "YellowBlack"));
        hashMapCar.put(new Car(83362950, 666), new InformationForCar(2021, "Lamborghini", 700000, "FantomBlack"));

        for (Map.Entry i:hashMapCar.entrySet() ) {
            System.out.println(i.getKey()+"\n"+i.getValue() );
            System.out.println("-------------------------");
        }
    }
}