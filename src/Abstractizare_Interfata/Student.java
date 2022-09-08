package Abstractizare_Interfata;

public class Student implements PunctajTrecere{
    private String firstName;
    private String lastName;
    private int doc;
    private double punctaj;

    public Student(String firstName, String lastName, int doc, double punctaj) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.doc = doc;
        this.punctaj = punctaj;
    }

    @Override
    public boolean nrDocumente(){
        return doc == 6;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return doc;
    }

    public double getPunctaj() {
        return punctaj;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int doc) {
        this.doc = doc;
    }

    public void setPunctaj(double punctaj) {
        this.punctaj = punctaj;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", doc=" + doc +
                ", punctaj=" + punctaj +
                '}';
    }
}
