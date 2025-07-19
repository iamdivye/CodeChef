import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int a=in.nextInt();
		    System.out.println(Math.min(a,n-a));
		}
	}
}
