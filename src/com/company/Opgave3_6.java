package com.company;

import java.util.Scanner;

public class Opgave3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // her gør vi at brugeren skal taste sin vægt og datatypen er en double
        System.out.println(" Indtast vægt i kg :");
        double vægt = input.nextDouble();

        // Her gør vi at brugeren skal indtaste sin højde og datatypen er en double
        System.out.println( " Indtast højde i meter :");
        double højde = input.nextDouble();

        // her laver vi en variabel der hedder bmi som trækker vægten fra højden^2
        double bmi = vægt / (højde * højde);



        System.out.println(" Dit bmi er : " + bmi);
        if (bmi < 18.5)
            System.out.println(" Undervægtig");
        else if (bmi < 25)
            System.out.println(" normal ");
        else if (bmi < 30)
                System.out.println(" du spiser for meget chokolade ");
        else System.out.println(" Overvægtig ");
            


    }
}
