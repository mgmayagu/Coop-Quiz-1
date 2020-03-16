/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author michaelmayaguari
 */
import java.util.Random;

public class TheTortoiseAndTheHare {

    static Random rand = new Random();

    public static int tortoisePosition(int curr) {

        int newPos = curr;
        int i = rand.nextInt(10) + 1;

        if (i <= 5) { //50% Fast plot -> 3 squares to the right
            return newPos += 3;

        } else if (i <= 7) { //20% slip -> 6 squares to the left 
            return newPos -= 6;

        } else {
            return newPos += 1; //30% slow plod -> 1 square to the right 	
        }
    }

    public static int harePosition(int curr) {

        int newPos = curr;
        int i = rand.nextInt(10) + 1;

        if (i <= 5) { //hops

            if (i <= 3) { //30% small hop -> 1 square to the right 
                return newPos += 1;
            } else //20% big hop -> 9 squares to the right
            {
                return newPos += 9;
            }

        } else if (i <= 8) { //slips

            if (i == 8) { //10% big slip -> 12 squares to the left
                return newPos -= 12;
            } else //20% small slip -> 2 squares to the left
            {
                return newPos -= 2;
            }

        } else //20% sleep -> no move at all
        {
            return newPos;
        }
    }

    public static void printRace(int tortoisePos, int harePos) {

        int i = 1;

        while (i <= 70) {

            if (tortoisePos == 1 && harePos == 1) { //base case: beginning of race
                System.out.print("B ");
                break;

            } else if (i == tortoisePos && tortoisePos == harePos) { //contenders land on the same square, the tortoise bites the hare
                System.out.print("OUCH!!!");
                break;

            } else if (i == tortoisePos) { //position of tortoise
                System.out.print("T ");
                ++i;

            } else if (i == harePos) { //position of hare
                System.out.print("H ");
                ++i;

            } else {
                System.out.print("  ");
                ++i;
            }
        }

        System.out.print("\n");
        for (int j = 0; j < 70; ++j) //prints out the track
        {
            System.out.print("_ ");
        }
    }

    public static void main(String[] args) {

        int tortoisePos = 1;
        int harePos = 1;
        int time = 0;

        System.out.print("ON YOUR MARK, GET SET\nBANG !!!!!\nAND THEY′RE OFF !!!!!");

        while (true) {

            //If an animal slips left before square 1, move it back to square 1.
            if (tortoisePos < 1) {
                tortoisePos = 1;
            }
            if (harePos < 1) {
                harePos = 1;
            }

            System.out.printf("\n\nTime: %d\n", time); //prints out the time

            printRace(tortoisePos, harePos);

            tortoisePos = tortoisePosition(tortoisePos);
            harePos = harePosition(harePos);
            //this conditional statement favors the tortoise (the “underdog”) by checking whether he crossed 70 first
            if (tortoisePos > 70) {
                System.out.println("\n\nTORTOISE WINS!!! YAY!!!");
                System.out.printf("Time Elapsed = %d", time);
                break;

            } else if (harePos > 70) {
                System.out.println("\n\nHare wins. Yuch.");
                System.out.printf("Time Elapsed = %d", time);
                break;
            }

            ++time;
        }
    }
}
