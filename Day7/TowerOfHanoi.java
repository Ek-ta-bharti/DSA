package Day7;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void toh(int x, int a, int b, int c) {
        if (x == 0) {
            return;
        }
        toh(x - 1, a, c, b);
        System.out.println(x + "[" + a + "-->" + b + "]");
        toh(x - 1, c, b, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. for tower of hanoi>> ");
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        toh(x , a, b, c);
        // for(int i=0; i<=n-1; i++){
        // System.out.println("Enter the no. for tower of hanoi>> ");

        // }
    }
}
