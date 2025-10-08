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
            int x = sc.nextInt();
            int y = sc.nextInt();
            String s = sc.next();

            long count0 = s.chars().filter(ch -> ch == '0').count();
            long count1 = n - count0;

            if (count0 == 0 || count1 == 0)
                System.out.println(0);
            else
                System.out.println(Math.min(x, y));
        }
        sc.close();
    }
}