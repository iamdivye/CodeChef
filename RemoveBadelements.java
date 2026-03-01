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
            
            int[] freq = new int[N + 1];
            int maxFreq = 0;
            
            for (int i = 0; i < N; i++) {
                int val = sc.nextInt();
                freq[val]++;
                if (freq[val] > maxFreq) {
                    maxFreq = freq[val];
                }
            }
            
            System.out.println(N - maxFreq);
        }
        
        sc.close();
    }
}