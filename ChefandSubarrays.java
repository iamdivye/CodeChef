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
            int n = sc.nextInt();
            long[] arr = new long[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                long sum = 0;
                long product = 1;
                
                for (int j = i; j < n; j++) {
                    sum += arr[j];
                    product *= arr[j];
                    if (sum == product) {
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
