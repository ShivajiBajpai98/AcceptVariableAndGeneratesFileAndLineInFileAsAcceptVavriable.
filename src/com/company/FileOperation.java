package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOperation
{
    int number;
    public  void fileOperatio()
    {

        Scanner scanner = new Scanner(System.in);



        boolean correct = false;

        while (!correct)
        {
            System.out.println("please enter a number between 1 and 230: ");
            int num = scanner.nextInt();
            this.number=num;
            if (num >230) {
                System.out.println("you entered a number high then 230");
            }
            else if (num <1)
            {
                System.out.println("you entered a number low then 230");
            }
            else
            {

                System.out.println("You entered a correct number and that number is"+" " +number +" "+"" +
                        " Generate a file with"+" " +number +" "+" number of lines " +
                        "and each line consist of a string that is unique" +
                        " with 100 characters long.");
                correct = true;
            }
        }


        try (FileWriter fstream = new FileWriter("greeting.txt");
             BufferedWriter info = new BufferedWriter(fstream))
        {


            if (number >= 1 && number<= 230)
            {

                for (int i = 1; i <= number; i++) {
                    //System.out.println();
                    info.write(String.format(AlphaNumericString.getAlphaNumericString() + "%n"));
                }
            } else {

                System.out.println("Please enter only number between 1 to 230");
            }

        } catch (Exception e) {
            System.out.println("A write error has occurred");
        }

    }


}
