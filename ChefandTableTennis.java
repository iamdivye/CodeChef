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
            String S = sc.next();
            int chef = 0, opp = 0;
            String result = "";

            for (char c : S.toCharArray()) {
                if (c == '1') chef++;
                else opp++;

                if ((chef >= 11 || opp >= 11) && Math.abs(chef - opp) >= 2) {
                    result = (chef > opp) ? "WIN" : "LOSE";
                    break;
                }
            }

            System.out.println(result);
        }
        sc.close();
    }
}