package com.company;

public class Opgave5_10 {

    public static void main(String[] args) {
        int i, j, resultat;

        for (j = 1; j <= 100; j++) { // Laver en tabel mellem 1 og 100 (der går nedad), og lægger en til hvis der ikke er 100.
            for (i = 1; i <= 10; i++) { // Sørger for at der kun er ti tal vandret
                resultat = i * j;         // Ganger resultatet, så der kommer alle tal mellem 1 og 1000.
                if (resultat % 3 == 0 && resultat % 4 == 0) {   //Markerer tallene der kan divideres med 3 eller 4.
                    System.out.print("*>");                     // Med en stjerne og krokodille ( *> ) der pejer på tallet.
                }
                if (resultat % 10 != 0) {
                    System.out.print("");
                }
                if (resultat > 10) {
                    System.out.print(" ");
                }
                System.out.print(resultat + " ");
            }

            System.out.println();
        }


    }
}