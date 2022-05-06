package PGO_03;

enum ProductType{
    Consumable, Entertainment, Electronic }

public class Products {
    public double price;
    private String name;
    private ProductType productType;
    private int quantity;
    public boolean isAvailable = false;

    public Products(String name, ProductType productType, double price, int quantity) {
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
        if (quantity > 0) isAvailable = true; }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("To pole mie może być puste"); }
        this.name = name; }
    public String getName() {
        return name;}


    void sell(){
        quantity = quantity - 1;}

    void increaseQuantity(int addedQuantity) {
        quantity = quantity + addedQuantity; }

}
