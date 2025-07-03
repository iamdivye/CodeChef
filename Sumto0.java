import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            if (N == 1) {
                System.out.println(-1);
                continue;
            }
            if (N % 2 == 0) {
                for (int i = 0; i < N / 2; i++) {
                    System.out.print("1 -1 ");
                }
                System.out.println();
            } else {
                System.out.print("1 2 -3 ");
                for (int i = 0; i < (N - 3) / 2; i++) {
                    System.out.print("1 -1 ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}