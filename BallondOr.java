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
            int countOfTwos = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                if (a == 2) {
                    countOfTwos++;
                }
            }
            if (countOfTwos % 8 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}