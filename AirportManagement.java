import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0)
		{
		    int n = in.nextInt();
		    int a;
		    int freq[] = new int[1440];
		    for(int i=0;i<n;i++)
		    {
		        a=in.nextInt();
		        freq[a]++;
		    }
		    for(int i=0;i<n;i++)
		    {
		        a=in.nextInt();
		        freq[a]++;
		    }
		    int max=0;
		    for(int i=0;i<1440;i++)
		    {
		        if(freq[i]>max)
		        max=freq[i];
		    }
		    System.out.println(max);
		}
	}
}
