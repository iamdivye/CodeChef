import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	 private static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (gcd(x, y) > 1) {
                System.out.println(0);
            } else if (gcd(x + 1, y) > 1 || gcd(x, y + 1) > 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}