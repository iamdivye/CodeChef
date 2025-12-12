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
            int C = sc.nextInt();

            int[] A = new int[N];
            for (int i = 0; i < N; i++) A[i] = sc.nextInt();

            String S = sc.next();

            int sum0 = 0, sum1 = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0') sum0 += A[i];
                else sum1 += A[i];
            }

            int ans = sum0;

            if (sum0 >= C) {
                ans = Math.max(ans, sum0 - C + sum1);
            }

            System.out.println(ans);
        }

	}
}
