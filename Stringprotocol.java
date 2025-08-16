import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int time = 0;
            int i = 0;
            while (i < n) {
                if (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                    time++;
                    i += 2;
                } else {
                    time++;
                    i++;
                }
            }
            System.out.println(time);
        }
    }
}