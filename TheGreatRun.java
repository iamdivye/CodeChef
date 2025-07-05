import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
		    int n = in.nextInt();
		    int k = in.nextInt();
		    int a[] = new int[n];
		    for(int i = 0; i < n; i++) {
		        a[i] = in.nextInt();
		    }
		    int max = 0;
		    for(int i = 0; i < n - k + 1; i++) {
		        int s = 0;
		        for(int j = 0; j < k; j++) {
		            s += a[i + j];
		        }
		        if(s > max) {
		            max = s;
		        }
		    }
		    System.out.println(max);
		}
	}
}