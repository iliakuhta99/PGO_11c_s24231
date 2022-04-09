package PGO_01_07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Napisz liczbę n, która równa się co najmniej 5 i jest liczbą nieparzystą");
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();

        var s = "*".repeat(n);
        var f = " ".repeat(n-3);
        var g = " ".repeat((n-3)/2);

        if ((n>=5)&&(n%2==1))
        {
            System.out.println (s);

            if (n>=7) {
                int i = ((n - 5) / 2);
                while (i > 0){
                    System.out.println("");
                    i--;
                }}

            System.out.println ("**"+f+"*");
            System.out.println ("*" + g + "*" + g + "*");
            System.out.println ("*"+f+"**");

            if (n>=7) {
                int i = ((n - 5) / 2);
                while (i > 0){
                    System.out.println("");
                    i--;
                }}
            System.out.println (s);
        }
        else
            System.out.println("spróbuj ponownie, aż warunek nie zostanie spełniony");



    }
}
