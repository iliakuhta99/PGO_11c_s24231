package PGO_02;


import java.time.LocalDate;
import java.time.Period;

public class Person extends Author{
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Adress adress;
    private Period age;

    public void Person(String name, String surname, LocalDate dateOfBirth, Adress adress){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        age = getAge(); }

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

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) {
            throw new RuntimeException("Data nie może być pusta lub pozniejsza niż dzisiaj"); }
        this.dateOfBirth = dateOfBirth; }
    public LocalDate getDateOfBirth() {
        return dateOfBirth; }

    public Period getAge(){
        return Period.between(dateOfBirth, LocalDate.now()); }

    public void setAdress(Adress adress) {
        this.adress = adress; }
    public Adress getAdress() {
        return adress; }

    public void author(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth; }
}
