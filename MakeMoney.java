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
		    int x=in.nextInt();
		    int c=in.nextInt();
		    int a,count=0,sum=0;
		    for(int i=0;i<n;i++){
		        a=in.nextInt();
		        if(x-a > c){
		            sum+=x;
		            count++;
		        }else{
		            sum+=a;
		        }
		    }
		    sum=sum-(count*c);
		    System.out.println(sum);
		}
	}
}
