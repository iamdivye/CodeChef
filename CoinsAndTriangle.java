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
            long N = sc.nextLong();
            long h = (long)((-1 + Math.sqrt(1 + 8.0 * N)) / 2);
            System.out.println(h);
        }
    }
}