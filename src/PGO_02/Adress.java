package PGO_02;

public class Adress {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public void Adress(String country, String city, String street, int house, int flat) {
        this.country=country;
        this.city=city;
        this.street=street;
        this.house=house;
        this.flat=flat; }

    public void setCountry(String country) {
        if (country == null||country.isEmpty()) {
            throw new RuntimeException("To pole nie może być puste"); }
        this.country = country; }
    public String getCountry() {
        return country; }

    public void setCity(String city) {
        if (city == null||city.isEmpty()) {
            throw new RuntimeException("To pole nie może być puste"); }
        this.city = city; }
    public String getCity() {
        return city; }

    public void setStreet(String street) {
        if (street == null||street.isEmpty()) {
            throw new RuntimeException("To pole nie może być puste"); }
        this.street = street; }
    public String getStreet() {
        return street; }

    public void setHouse(int house) {
        this.house = house; }
    public int getHouse() {
        return house; }

    public void setFlat(int flat) {
        this.flat = flat; }
    public int getFlat() {
        return flat; }
}
