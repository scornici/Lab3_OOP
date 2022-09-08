package Abstractizare;

public class Volvo extends CarRate {
    public Volvo(String name, double safetyRating, int horsepower, int price){
        super(name, safetyRating, horsepower, price);
    }

    @Override
    String category(){
        if ((price>=60000)&& (price<750000) && (safetyRating>=9) && (safetyRating<10) && (horsepower > 310)){
            return "Expensive Elite";
        }
        else if ((price<60000) && (safetyRating<9.7) && (horsepower>=200) && (horsepower <290)){
            return "Good price Standart";
        }
        else{
            return "Budget";
        }
    }

    @Override
    public String toString() {
        return "Volvo{" +
                "name='" + name + '\'' +
                ", safety rating=" + safetyRating +
                ", horse power=" + horsepower +
                ", price=" + price +
                '}';
    }
}
