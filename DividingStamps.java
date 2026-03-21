import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += sc.nextLong();
        }
        
        long required = (long)n * (n + 1) / 2;
        
        if (sum == required) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}