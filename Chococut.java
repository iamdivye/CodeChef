import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            long K = sc.nextLong();

            long total = N * M;
            if (K == 0) {
                out.append(total).append('\n');
                continue;
            }

            long INF = Long.MAX_VALUE / 4;
            long bestGiven = INF;
            long needX = divCeil(K, M); 
            if (needX >= 1 && needX <= N - 1) {
                bestGiven = Math.min(bestGiven, needX * M);
            }
            long needY = divCeil(K, N); 
            if (needY >= 1 && needY <= M - 1) {
                bestGiven = Math.min(bestGiven, needY * N);
            }

            bestGiven = Math.min(bestGiven, total);
            long aliceKeeps = total - bestGiven;
            out.append(aliceKeeps).append('\n');
        }

        System.out.print(out.toString());
        sc.close();
    }
    private static long divCeil(long a, long b) {
        return (a + b - 1) / b;
    }
}