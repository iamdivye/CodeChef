import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int N = sc.nextInt();
            int[] P = new int[N];
            for(int i=0; i<N; ++i) {
                P[i] = sc.nextInt();
            }
            int one = -1, n = -1;
            for(int i=0; i<N; ++i) {
                if(P[i] == 1) one = i;
                if(P[i] == N) n = i;
            }
            int res = one + (N - 1 - n);
            if(one > n) res--;
            System.out.println(res);
        }
    }
}