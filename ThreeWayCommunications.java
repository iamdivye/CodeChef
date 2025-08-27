import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 0; test < T; ++test) {
            int R = sc.nextInt();
            int[][] persons = new int[3][2];
            for (int i = 0; i < 3; ++i) {
                persons[i][0] = sc.nextInt();
                persons[i][1] = sc.nextInt();
            }
            int[][] dist = new int[3][3];
            for (int i = 0; i < 3; ++i)
                for (int j = i + 1; j < 3; ++j) {
                    int dx = persons[i][0] - persons[j][0];
                    int dy = persons[i][1] - persons[j][1];
                    dist[i][j] = dist[j][i] = dx * dx + dy * dy;
                }
            int R2 = R * R;
            int reachable = 0;
            for (int i = 0; i < 3; ++i)
                for (int j = i + 1; j < 3; ++j)
                    if (dist[i][j] <= R2) reachable++;
            System.out.println(reachable >= 2 ? "yes" : "no");
        }
    }
}