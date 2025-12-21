import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder output = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            
            String[] goalsStr = br.readLine().split(" ");
            String[] foulsStr = br.readLine().split(" ");
            
            int maxPoints = 0;
            
            for (int i = 0; i < n; i++) {
                int goals = Integer.parseInt(goalsStr[i]);
                int fouls = Integer.parseInt(foulsStr[i]);
                
                int points = Math.max(goals * 20 - fouls * 10, 0);
                maxPoints = Math.max(maxPoints, points);
            }
            
            output.append(maxPoints).append("\n");
        }
        
        System.out.print(output);
    }
}
