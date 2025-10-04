import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        while (T-- > 0) {
            long maxT = sc.nextLong();
            long maxN = sc.nextLong();
            long sumN = sc.nextLong();
            long full = Math.min(maxT, sumN / maxN);
            long used = full * maxN;
            long rem = sumN - used;
            long ans = full * (maxN * maxN);
            if (rem > 0 && full < maxT) {
                ans += rem * rem;
            }

            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
        sc.close();
    }
}