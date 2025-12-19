import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[] positions = new int[N + 1]; 
            for (int seat = 1; seat <= N; seat++) {
                int person = scanner.nextInt();
                positions[person] = seat;
            }
            
            boolean[] occupied = new boolean[N + 1];
            for (int i = 1; i <= N; i++) {
                occupied[i] = true;
            }
            
            int totalDisturbances = 0;
            for (int person = N; person >= 1; person--) {
                int pos = positions[person];
                int leftCount = 0;
                for (int i = 1; i < pos; i++) {
                    if (occupied[i]) {
                        leftCount++;
                    }
                }
                int rightCount = 0;
                for (int i = pos + 1; i <= N; i++) {
                    if (occupied[i]) {
                        rightCount++;
                    }
                }
                totalDisturbances += Math.min(leftCount, rightCount);
                occupied[pos] = false;
            }
            
            result.append(totalDisturbances).append("\n");
        }
        
        System.out.print(result);
        scanner.close();
    }
}
