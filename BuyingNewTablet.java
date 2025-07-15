import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		int n,b,area,i,w,h,p;
		while(t-->0){
		    n=in.nextInt();
		    b=in.nextInt();
		    area=0;
		    for(i=0;i<n;i++){
		        w=in.nextInt();
		        h=in.nextInt();
		        p=in.nextInt();
		        if(p<=b && (w*h)>area){
		            area=w*h;
		        }
		    }
		    if(area==0)
		    System.out.println("no tablet");
		    else
		    System.out.println(area);
		}
	}
}
