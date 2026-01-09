import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int T = fs.nextInt();
        while (T-- > 0) {
            int N = fs.nextInt();
            String A = fs.next();
            String B = fs.next();

            boolean[] needed = new boolean[26];

            for (int i = 0; i < N; i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    needed[B.charAt(i) - 'a'] = true;
                }
            }

            int ans = 0;
            for (boolean b : needed) {
                if (b) ans++;
            }

            out.append(ans).append('\n');
        }

        System.out.print(out.toString());
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreElements()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
}