package PGO_01_06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 900) +100);
        }
        System.out.print ("Generated array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]);
        }
        Arrays.sort(array);
        System.out.println ("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]);
        }

        System.out.println();

    }
}
