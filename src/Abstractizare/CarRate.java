package Abstractizare;

public abstract class CarRate {
    protected String name;
    protected double safetyRating;
    protected int horsepower;
    protected int price;

    //constructor
    protected CarRate(String name, double safetyRating, int horsepower, int price ){
        this.name = name;
        this.safetyRating = safetyRating;
        this.horsepower = horsepower;
        this.price = price;
    }
    abstract String category();

    public String getName() {
        return name;
    }

    public double getSafetyRating() {
        return safetyRating;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSafetyRating(double safetyRating) {
        this.safetyRating = safetyRating;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
