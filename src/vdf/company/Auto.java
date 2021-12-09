package vdf.company;

public class Auto {

    private int viteze;
    private int vitezaMaxima;
    private String culoare;

//    Variabile statice,
//    1 -> va inregistra numarul total de instante create folosind aceasta clasa
//    2 -> numele marcii va fi mereu constant pentru toate instantele si este initializat o data cu instanta.

    private static int unitatiProduse;
    private static String marca="Dacie";

    //    Constructor
    public Auto(int viteze, int vitezaMaxima, String culoare) {
        this.viteze = viteze;
        this.vitezaMaxima = vitezaMaxima;
        this.culoare = culoare;

        unitatiProduse++;
    }

    public int getViteze() {
        return viteze;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public String getCuloare() {
        return culoare;
    }

    public static int getUnitatiProduse() {
        return unitatiProduse;
    }

    public static String getMarca() {
        return marca;
    }
}
