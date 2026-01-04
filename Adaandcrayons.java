import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            int segU = 0, segD = 0;
            char prev = ' ';
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != prev) {
                    if (c == 'U') segU++;
                    else segD++;
                    prev = c;
                }
            }
            System.out.println(Math.min(segU, segD));
        }
    }
}