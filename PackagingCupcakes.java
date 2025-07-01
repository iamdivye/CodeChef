import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            if (N == 2) {
                System.out.println(2);
            } else {
                System.out.println((N / 2) + 1);
            }
        }
        scanner.close();
    }
}