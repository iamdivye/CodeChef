import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = in.nextInt();
            in.nextLine(); 
            String S = in.nextLine();
            
            boolean isEasy = true;
            int maxConsecutiveConsonants = 0;
            int currentConsecutiveConsonants = 0;
            
            for (int i = 0; i < N; i++) {
                char c = S.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    currentConsecutiveConsonants = 0;
                } else {
                    currentConsecutiveConsonants++;
                    if (currentConsecutiveConsonants >= 4) {
                        isEasy = false;
                        break;
                    }
                }
            }
            
            if (isEasy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}