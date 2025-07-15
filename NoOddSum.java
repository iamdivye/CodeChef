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
	        int a[]=new int[3];
	        for(int i=0;i<n;i++){
	            int b=in.nextInt();
	            a[b]++;
	        }
	        if(a[1]==0 || a[2]==0)
	        System.out.println(0);
	        else{
	            if(a[1]%2==0)
	            System.out.println(Math.min(a[2],a[1]/2));
	            else
	            System.out.println(a[2]);
	        }
	    }

	}
}
