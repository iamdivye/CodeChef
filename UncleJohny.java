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
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int K = sc.nextInt();
            
            int uncleJohny = arr[K - 1]; 
            Arrays.sort(arr); 
            int pos = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] == uncleJohny) {
                    pos = i + 1;
                    break;
                }
            }
            
            System.out.println(pos);
        }
        
    }
}