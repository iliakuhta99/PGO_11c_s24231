package PGO_05;

public class Main {
    public static void main(String[] args) {
        Eliksir EL01 = new Eliksir("EL01",
                new Liquid("LI01", 33, 25));
        Flower F01 = new Flower("F01", 23, 45);
        Root R01 = new Root("R01", 70, 25);
        Crystal CR01 = new Crystal("CR01", 65, 23, 34);
        Ore O01 = new Ore("OO1", 900, true, 45);
        EL01.addIngredient(R01);
        EL01.addIngredient(F01);
        EL01.addIngredient(O01);
        EL01.addIngredient(CR01);
        EL01.create();
        System.out.println( EL01);} }
