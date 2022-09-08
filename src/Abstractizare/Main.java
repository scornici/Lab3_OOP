package Abstractizare;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Volvo len = new Volvo("XC90",9.6,288,59000);
        Mustang ford = new Mustang("Shelby GT350",7.1,306,3850000);

        List<CarRate> carRateList = List.of(len,ford);
        carRateList.forEach(carRate -> {
            System.out.println(carRate);
            System.out.println("Car Type: " + carRate.category());
        });



    }
}
