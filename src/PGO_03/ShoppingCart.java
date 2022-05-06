package PGO_03;

import java.util.ArrayList;

public class ShoppingCart {
    private int id = 0;
    ArrayList<Products> list;
    double totalPrice = 0;
    double deliveryTime;
    private static int count = 0;

    public void sell(){
        for(Products prod: list) {
            prod.sell(); }
    }

    public ShoppingCart(ArrayList<Products> list) {
        id = count+1;
        this.list = list;
        for(Products prod : list){
            if(prod.isAvailable){
                totalPrice = totalPrice + prod.price; }
        }
    }
}