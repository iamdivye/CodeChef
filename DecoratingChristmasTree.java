import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long N = scanner.nextLong();
            long X = scanner.nextLong();
            long Y = scanner.nextLong();
            
            long lowerBound = Math.max(0, 2 * N - X);
            long upperBound = Math.min(N, Y / 3);
            
            if (lowerBound <= upperBound) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}