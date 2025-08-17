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
            int n = sc.nextInt();
            String s = sc.next();
            
            int presentCount = 0;
            int maxZeroBlock = 0, currentZeroBlock = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    presentCount++;
                    currentZeroBlock = 0;
                } else {
                    currentZeroBlock++;
                    maxZeroBlock = Math.max(maxZeroBlock, currentZeroBlock);
                }
            }
            int result = presentCount + maxZeroBlock;
            System.out.println(result);
        }
    }
}