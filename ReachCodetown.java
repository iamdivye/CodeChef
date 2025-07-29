import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        
        for (int t = 0; t < T; t++) {
            String S = in.nextLine();
            String target = "CODETOWN";
            
            if (S.equals(target)) {
                System.out.println("YES");
                continue;
            }
            
            boolean possible = true;
            for (int i = 0; i < 8; i++) {
                char sChar = S.charAt(i);
                char tChar = target.charAt(i);
                
                boolean sVowel = isVowel(sChar);
                boolean tVowel = isVowel(tChar);
                
                if (sVowel != tVowel) {
                    possible = false;
                    break;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
    }
    
    private static boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}