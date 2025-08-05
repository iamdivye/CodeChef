import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 0; test < T; test++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            int count = 0;
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i];
                if (sum >= M) {
                    count++;
                    sum = 0;
                }
            }
            System.out.println(count);
        }
    }
}