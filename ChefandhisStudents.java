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
            int count = 0;
            int n = s.length();
            char[] arr = new char[n];
            for (int i = 0; i < n; ++i) {
                if (s.charAt(i) == '>')
                    arr[i] = '<';
                else if (s.charAt(i) == '<')
                    arr[i] = '>';
                else
                    arr[i] = '*';
            }
            for (int i = 0; i < n-1; ++i) {
                if (arr[i] == '>' && arr[i+1] == '<') count++;
            }
            System.out.println(count);
        }
    }
}