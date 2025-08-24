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
            String B = sc.next();
            int present = 0;
            for (int i = 0; i < N; i++) {
                if (B.charAt(i) == '1') present++;
            }
            int totalPossible = present + (120 - N);
            System.out.println(totalPossible >= 90 ? "YES" : "NO");
        }
    }
}