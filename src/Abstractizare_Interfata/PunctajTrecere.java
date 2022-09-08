package Abstractizare_Interfata;

public interface PunctajTrecere {
    int MIN = 65;
    String success = "Studentul este admis! ";
    String err = "Nu este admis, punctajul min: " + MIN + " sau nu are toate documentele necesare (6)";

    boolean nrDocumente();
}
