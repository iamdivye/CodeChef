import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (
                X + Y == Z ||
                Y + Z == X ||
                Z + X == Y
            ) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
