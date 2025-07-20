import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            int W = in.nextInt();
            int X = in.nextInt();
            int Y = in.nextInt();
            int Z = in.nextInt();
            
            int total = W + Y * Z;
            
            if (total > X) {
                System.out.println("overflow");
            } else if (total == X) {
                System.out.println("filled");
            } else {
                System.out.println("unfilled");
            }
        }
    }
}