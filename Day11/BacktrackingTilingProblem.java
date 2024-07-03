package Day11;

public class BacktrackingTilingProblem {

    public static int getWay(int n) {
        if (n <= 3) {
            return n;
        }
        return getWay(n - 1) + getWay(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("For n=1, total way = " + getWay(1));
        System.out.println("For n=2, total way = " + getWay(2));
        System.out.println("For n=3, total way = " + getWay(3));
        System.out.println("For n=4, total way = " + getWay(4));
        System.out.println("For n=5, total way = " + getWay(5));
        System.out.println("For n=6, total way = " + getWay(6));

    }

}