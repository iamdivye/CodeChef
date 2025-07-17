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
		    int n=in.nextInt(),max=0;
		    int a[]=new int[101];
		    for(int i=0;i<n;i++){
		        int k=in.nextInt();
		        a[k]++;
		        if(a[k]>max)
		        max=a[k];
		    }
		    System.out.println(n-max);
		}
	}
}
