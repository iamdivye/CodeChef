import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(a);

            long totalSum = 0;
            int splitPoint = n / 2;
            for (int i = 0; i < splitPoint; i++) {
                totalSum -= a[i];
            }
            for (int i = splitPoint; i < n; i++) {
                totalSum += a[i];
            }

            out.println(totalSum);
        }
        out.flush();
    }
}