import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            String[] parts = br.readLine().split(" ");
            int N = Integer.parseInt(parts[0]);
            int X = Integer.parseInt(parts[1]);
            String S = br.readLine();
            
            int swipes = 0;
            boolean valid = true;
            
            for (char c : S.toCharArray()) {
                if (c == '1') {
                    swipes = X; 
                } else { // c == '0'
                    if (swipes == 0) {
                        valid = false;
                        break;
                    }
                    swipes--;
                }
            }
            
            sb.append(valid ? "YES\n" : "NO\n");
        }
        
        System.out.print(sb);
    }
}