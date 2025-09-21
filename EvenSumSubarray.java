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
            int[] arr = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            if (sum % 2 == 0) {
                System.out.println(N);
                continue;
            }

            int firstOdd = -1, lastOdd = -1;
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 != 0) {
                    if (firstOdd == -1) firstOdd = i;
                    lastOdd = i;
                }
            }

            if (firstOdd == -1) {
                System.out.println(0);
            } else {
                int option1 = N - (firstOdd + 1); 
                int option2 = lastOdd;            
                System.out.println(Math.max(option1, option2));
            }
        }

        sc.close();
    }
}