package Abstractizare_Interfata;

public class Main {
    public static void main(String[] args){

        // interface
        Student pnct = new Student("Ivan","Scornici",6,60);

        if ((pnct.getPunctaj()>=PunctajTrecere.MIN )&&(pnct.nrDocumente())) {
            System.out.println(PunctajTrecere.success);
        }
        else{
            System.out.println(PunctajTrecere.err);
        }
        pnct.setPunctaj(65);

        if ((pnct.getPunctaj()>=PunctajTrecere.MIN )&&(pnct.nrDocumente())) {
            System.out.println(PunctajTrecere.success);
        }
        else{
            System.out.println(PunctajTrecere.err);
        }


    }
}
