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
            int N = sc.nextInt();
            int count = 0;

            while (N > 0) {
                int side = (int) Math.sqrt(N);
                N -= side * side;
                count++;
            }

            System.out.println(count);
        }

        sc.close();
    }
}