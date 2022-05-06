package PGO_03;


import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String name;
    private String surname;
    private  double moneyInCash;
    private double moneyOnCard;
    private ArrayList<ShoppingCart> history = new ArrayList<>();

    public void Person(String name, String surname, double moneyInCash, double moneyOnCard, ArrayList history){
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
        this.history = history;}

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("To pole mie może być puste"); }
        this.name = name; }
    public String getName() {
        return name;}

    public void setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new RuntimeException("To pole mie może być puste"); }
        this.surname = surname; }
    public String getSurname() {
        return surname; }

    ShoppingCart makeOrder(){
        ArrayList<Products> produkts = new ArrayList<>();
        return new ShoppingCart(produkts);}

    void buyByCard(ShoppingCart basket){
        if(basket.totalPrice <= moneyOnCard){
            moneyOnCard = moneyOnCard - basket.totalPrice;
            history.add(basket);}
    }

    void buyInCash(ShoppingCart basket){
        if(basket.totalPrice <= moneyInCash){
            moneyInCash = moneyInCash - basket.totalPrice;
            history.add(basket);
        }
    }


}
