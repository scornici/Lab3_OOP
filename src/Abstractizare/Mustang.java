package Abstractizare;

public class Mustang extends CarRate {
    public Mustang(String name, double safetyRating, int horsepower, int price){
        super(name, safetyRating, horsepower, price);
    }

    @Override
    String category(){
        if ((price>1000000)&& (price<5000000) && (safetyRating>=7) && (horsepower>=250) && (horsepower<350)){
            return "Expensive Elite";
        }
        else if ((price>1000000) && (price<1500000) && (safetyRating < 7) && (horsepower < 250)){
            return "Good price Standart";
        }
        else{
            return "Budget";
        }
    }

    @Override
    public String toString() {
        return "Mustang{" +
                "name='" + name + '\'' +
                ", safety rating=" + safetyRating +
                ", horse power=" + horsepower +
                ", price=" + price +
                '}';
    }
}
