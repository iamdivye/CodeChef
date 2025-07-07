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
		    int []a= new int[101];
		    while(n-- > 0){
		        int k=in.nextInt();
		        a[k]++;
		    }
		    boolean even=true;
		    for(int i=1;i<=100;i++){
		        if(a[i]%2!=0){
		            even=false;
		            break;
		        }
		    }
		    if(even)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
