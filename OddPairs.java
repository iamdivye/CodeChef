import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long N = sc.nextLong();
            long odd = (N + 1) / 2;
            long even = N / 2;
            System.out.println(2 * odd * even);
        }
    }
}