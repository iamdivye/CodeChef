import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            int Y = Integer.parseInt(br.readLine().trim());
            
            if (Y == 0) {
                sb.append("1\n");
            } else {
                long result = 3L * Y;
                sb.append(result).append("\n");
            }
        }
        
        System.out.print(sb.toString());
    }
}
