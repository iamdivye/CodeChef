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
            String A = sc.next();
            String B = sc.next();

            if (N == 1) {
                System.out.println(A.equals(B) ? "YES" : "NO");
                continue;
            }
            int countA0 = 0, countA1 = 0;
            for (char c : A.toCharArray()) {
                if (c == '0') countA0++;
                else countA1++;
            }
            int countB0 = 0, countB1 = 0;
            for (char c : B.toCharArray()) {
                if (c == '0') countB0++;
                else countB1++;
            }
            if (countA0 == countB0 && countA1 == countB1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}