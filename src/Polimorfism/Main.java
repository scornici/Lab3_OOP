package Polimorfism;

public class Main {
    public static void main(String[] args){

        Job ttl = new Director();
        System.out.println("Job Title : " + ttl.getName() + ", estimated salary : " + ttl.salary());
        ttl = new Manager();
        System.out.println("Job Title : " + ttl.getName() + ", estimated salary : " + ttl.salary());
        ttl = new EntryLevel();
        System.out.println("Job Title : " + ttl.getName() + ", estimated salary : " + ttl.salary());



    }
}
