import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int a[]= new int[11];
		    for(int i=0;i<n;i++){
		        int k=in.nextInt();
		        a[k]++;
		    }
		    int max=0;
		    for(int i=1;i<11;i++){
		        if(a[i]>max)
		        max=a[i];
		    }
		    System.out.println(n-max);
		}
	}
}
