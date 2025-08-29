import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 0; test < T; test++) {
            int N = sc.nextInt();
            int[] P = new int[N];
            Map<Integer, Integer> freq = new HashMap<>();
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
                freq.put(P[i], freq.getOrDefault(P[i], 0) + 1);
            }
            boolean possible = true;
            for (int k : freq.keySet()) {
                if (freq.get(k) % k != 0) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}