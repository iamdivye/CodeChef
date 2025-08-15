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
            int[] maxPenalty = new int[100001];
            
            for (int i = 1; i <= N; i++) {
                int returnDay = sc.nextInt();
                if (i > maxPenalty[returnDay]) {
                    maxPenalty[returnDay] = i;
                }
            }
            long totalPenalty = 0;
            for (int penalty : maxPenalty) {
                totalPenalty += penalty;
            }
            
            System.out.println(totalPenalty);
        }
    }
}