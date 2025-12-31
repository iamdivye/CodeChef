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
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            
            int[] freq = new int[11]; 
            
            for (int i = 0; i < n; i++) {
                int laptop = Integer.parseInt(input[i]);
                freq[laptop]++;
            }
            int maxFreq = 0;
            for (int i = 1; i <= 10; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                }
            }
            int countMax = 0;
            int maxLaptop = 0;
            for (int i = 1; i <= 10; i++) {
                if (freq[i] == maxFreq) {
                    countMax++;
                    maxLaptop = i;
                }
            }
            if (countMax == 1) {
                sb.append(maxLaptop).append("\n");
            } else {
                sb.append("CONFUSED\n");
            }
        }
        
        System.out.print(sb);
    }
}