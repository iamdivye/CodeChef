import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
            }
            Set<Integer> candidates = new HashSet<>();
            candidates.add(0); 
            for (int b : B) {
                candidates.add(b);
            }
            
            int maxSatisfaction = Integer.MIN_VALUE;
            for (int L : candidates) {
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    if (B[i] <= L && A[i] > 0) {
                        sum += A[i];
                    }
                }
                int satisfaction = sum - L;
                maxSatisfaction = Math.max(maxSatisfaction, satisfaction);
            }
            
            System.out.println(maxSatisfaction);
        }
        sc.close();
    }
}