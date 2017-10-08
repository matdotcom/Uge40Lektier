package com.company;

import java.util.Scanner;

public class Opgave3_17 {
    public static void main(String[] args) {

        // Importerer scanner.
        Scanner input = new Scanner(System.in);

        // Her printer vi i konsollen hvilke tal der er hvad.
        System.out.println(" Scissor (0), Rock (1), Paper (2):");
        System.out.println(" Pick a number between 0 and 2");
        // vores variabel for hvad man vælger hedder rps som står for rockpaperscissors
        int RPS = input.nextInt();
        int computervalg = (int) (Math.random() * 3);

        System.out.println(RPS);
        System.out.println(computervalg);

        if (RPS == computervalg)
            System.out.println(" It's a draw ");
        if (RPS == 0 && computervalg == 1 )
            System.out.println(" Computer wins! with Rock over scissor ");
        if (RPS == 0 && computervalg == 2)
            System.out.println(" You win! Scissor cuts paper ");
        if (RPS == 1 && computervalg == 0)
            System.out.println(" You win! Rock beats scissor ");
        if (RPS == 1 && computervalg == 2)
            System.out.println(" You Lose! Paper beats Rock! ");
        if (RPS == 2 && computervalg == 0)
            System.out.println(" You Lose! Scissor beats paper ");
        if (RPS == 2 && computervalg == 1)
            System.out.println(" You win! Paper beats rock! ");



    }
}
