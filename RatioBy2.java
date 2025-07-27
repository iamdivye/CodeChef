import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int X = in.nextInt();
            int Y = in.nextInt();
            
            if (X >= 2 * Y || Y >= 2 * X) {
                System.out.println(0);
                continue;
            }
            
            int operations1 = (2 * Y - X + 1) / 2;
            int operations2 = (2 * X - Y + 1) / 2;
            
            System.out.println(Math.min(operations1, operations2));
        }
    }
}