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
            long P1 = sc.nextLong();
            long P2 = sc.nextLong();
            long K = sc.nextLong();
            
            long total = P1 + P2;
            long block = total / K;
            
            if (block % 2 == 0) {
                System.out.println("CHEF");
            } else {
                System.out.println("COOK");
            }
        }
        
        sc.close();
    }
}