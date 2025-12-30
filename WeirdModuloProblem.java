import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	 public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int current = Integer.parseInt(input[i]);
                if (current < min) {
                    min = current;
                }
            }
            System.out.println(min);
        }
    }
}