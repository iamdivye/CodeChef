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
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            int diff = Math.abs(X - Y);
            int extra = Math.max(0, diff - 1);
            
            int result = X + Y + extra;
            System.out.println(result);
        }
        
        sc.close();
    }
}