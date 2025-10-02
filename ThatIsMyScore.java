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
            int N = sc.nextInt();
            int[] best = new int[9]; 
            for (int i = 0; i < N; i++) {
                int p = sc.nextInt();
                int s = sc.nextInt();
                if (p >= 1 && p <= 8) {
                    if (s > best[p]) best[p] = s;
                }
            }
            int total = 0;
            for (int p = 1; p <= 8; p++) total += best[p];
            System.out.println(total);
        }
        sc.close();
    }
}