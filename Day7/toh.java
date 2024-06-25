package Day7;

import java.io.*;
import java.util.*;

public class toh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int disks = scanner.nextInt();

        System.out.print("Enter number of towers: ");
        int towers = scanner.nextInt();

        // Create an array for tower names
        char[] towerNames = new char[towers];
        for (int i = 0; i < towers; i++) {
            towerNames[i] = (char) ('A' + i);
        }

        scanner.close();

        // Solving Tower of Hanoi with the first 3 towers
        solveHanoi(disks, towerNames[0], towerNames[1], towerNames[2]);
    }

    // Function to solve Tower of Hanoi problem
    // Move 'n' disks from source to destination using auxiliary tower
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move top n-1 disks from source to auxiliary using destination as auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from auxiliary to destination using source as auxiliary
        solveHanoi(n - 1, auxiliary, destination, source);
    }
}