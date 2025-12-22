import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n % 2 == 1) {
                System.out.println("NO");
                continue;
            }
            
            int[] freq = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }
            
            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
        
        sc.close();
    }
}
