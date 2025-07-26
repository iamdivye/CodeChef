import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int sum=0,b;
		    for(int i=0;i<n;i++){
		        b=in.nextInt();
		        sum+=b;
		    }
		    if(sum%2==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
