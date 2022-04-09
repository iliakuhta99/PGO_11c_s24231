package PGO_02;

import java.util.Scanner;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args){

            Person p1 = new Person();
            p1.author("Joan", "Rowlingz", LocalDate.of(1956,06, 11));

            Adress a1 = new Adress();
            a1.Adress("Polska", "Warszawa", "Siedmiogrodzka", 3, 45);
            Adress a2 = new Adress();
            a2.Adress("Polska", "Warszawa", "Grzybowska", 6, 33);

            Person p2 = new Person();
            Person p3 = new Person();
            p2.Person("Bartolomiej", "Kowalski", LocalDate.now(), a1);
            p3.Person("Izabella", "Krakowska", LocalDate.now(), a2);

            Book b1 = new Book();
            b1.book("Harry Potter i kamień filozoficzny", Genre.Fantasy, Lang.Polish, p1);
            b1.BorrowBook(p2);

            b1.GiveBack();
            Book b2 = new Book();
            b2.book("Harry Potter i kamień filozoficzny", Genre.Fantasy, Lang.Polish, p1);


        }
    }