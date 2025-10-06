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
            
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            
            boolean possible = true;
            for (int f : freq) {
                if (f % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
        
        sc.close();
    }
}