import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();

            long row = N - 1;
            long col = N - 1;
            long diag1 = Math.min(X - 1, Y - 1);
            long diag2 = Math.min(N - X, N - Y);
            long diag3 = Math.min(X - 1, N - Y);
            long diag4 = Math.min(N - X, Y - 1);

            long total = row + col + diag1 + diag2 + diag3 + diag4;
            System.out.println(total);
        }
    }
}