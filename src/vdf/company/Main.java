package vdf.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Fara o instanta a clasei auto putem sa printam variabiilele statice din clasa
        System.out.println("Numarul de unitati produse este ->" + Auto.getUnitatiProduse());
        System.out.println("Marca este -> " + Auto.getMarca());

        Auto logan = new Auto(6,180,"Rosie");

//        Dupa o instanta putem apela atat clasa pentru a verifica variabilele statice sau instanta in sine oferind acelasi rezultat
        System.out.println("Putem verifica din clasa nr de unitati produse -> " +Auto.getUnitatiProduse() + " si marca " + Auto.getMarca());
        System.out.println("Verificare folosind instanta Logan pentru unitati produse -> " + logan.getUnitatiProduse() + " cat si marca " + logan.getMarca());

        Auto docker = new Auto(5,160,"Alb");
        Auto sandero = new Auto(6,175,"Albastra");


//        Putem vedea valorile statice prezente atat in clasa cat si in fiecare instanta creata. Numarul de unitati produse a fost incrementat
//        pentru fiecare noua instanta si marca a ramas neschimbata

        System.out.println("Putem verifica din clasa nr de unitati produse -> " +Auto.getUnitatiProduse() + " si marca " + Auto.getMarca());
        System.out.println("Verificare folosind instanta Logan pentru unitati produse -> " + logan.getUnitatiProduse() + " cat si marca " + logan.getMarca());
        System.out.println("Verificare folosind instanta docker pentru unitati produse -> " + docker.getUnitatiProduse() + " cat si marca " + docker.getMarca());
        System.out.println("Verificare folosind instanta sandero pentru unitati produse -> " + sandero.getUnitatiProduse() + " cat si marca " + sandero.getMarca());






    }
}
