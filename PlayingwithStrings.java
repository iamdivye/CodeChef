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
            String S = sc.next();
            String R = sc.next();
            
            int sOnes = 0;
            int rOnes = 0;
            
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') sOnes++;
                if (R.charAt(i) == '1') rOnes++;
            }
            
            if (sOnes == rOnes) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}