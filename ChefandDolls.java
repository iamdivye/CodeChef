import java.util.*;
import java.lang.*;
import java.io.*;

public class ChefandDolls
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int result = 0;
            for (int i = 0; i < N; i++) {
                int type = scanner.nextInt();
                result ^= type;
            }
            System.out.println(result);
        }
        scanner.close();
    }
}