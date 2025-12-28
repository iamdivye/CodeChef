import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] fingers = new int[N];
            int[] sheaths = new int[N];
            
            for (int i = 0; i < N; i++) fingers[i] = sc.nextInt();
            for (int i = 0; i < N; i++) sheaths[i] = sc.nextInt();
            
            boolean front = true, back = true;
            
            for (int i = 0; i < N; i++) {
                if (front && fingers[i] > sheaths[i]) front = false;
                if (back && fingers[i] > sheaths[N - 1 - i]) back = false;
                if (!front && !back) break;
            }
            
            if (front && back) result.append("both\n");
            else if (front) result.append("front\n");
            else if (back) result.append("back\n");
            else result.append("none\n");
        }
        
        System.out.print(result);
        sc.close();
    }
}