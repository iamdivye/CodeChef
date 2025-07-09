import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-- > 0){
		    int n=in.nextInt();
		    int x=in.nextInt();
		    if(n%2 == 0 || n%2 == x%2)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}

	}
}
