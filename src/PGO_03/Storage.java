package PGO_03;

public class Storage {
    Double deliveryTime;

    public Storage(int deliveryTime){
        setDeliveryTime(deliveryTime); }

    public void setDeliveryTime(int deliveryTime) {
        if (deliveryTime < 0) {
            throw new RuntimeException("Czas dostawy nie moze byc mniej niz 0");
        }

}}
