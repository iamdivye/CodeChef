import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String A = br.readLine();
            String B = br.readLine();
            
            boolean hasChoice = false;
            int totalOnes = 0;
            
            for (int i = 0; i < N; i++) {
                char a = A.charAt(i);
                char b = B.charAt(i);
                if (a != b) {
                    hasChoice = true;
                }
                if (a == '1' && b == '1') {
                    totalOnes++;
                }
            }
            
            if (hasChoice) {
                bw.write("YES\n");
            } else {
                if (totalOnes % 2 == 1) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        }
        bw.flush();
    }
}