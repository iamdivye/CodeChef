import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            
            int runsOf0 = 0;
            int runsOf1 = 0;
            
            char prev = ' ';
            for (int i = 0; i < n; i++) {
                char current = s.charAt(i);
                if (current != prev) {
                    if (current == '0') {
                        runsOf0++;
                    } else {
                        runsOf1++;
                    }
                    prev = current;
                }
            }
            
            System.out.println(Math.min(runsOf0, runsOf1));
        }
    }
}