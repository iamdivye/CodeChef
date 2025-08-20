import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in= new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int n=in.nextInt();
	        int a=n;
	        boolean k = digitSum(n),ne;
	        while(true){
	            a+=1;
	            ne = digitSum(a);
	            if(k!=ne){
	            System.out.println(a);
	            break;
	            }
	        }
	    }
	}
	public static boolean digitSum(int n){
	    int s=0;
	    while(n>0){
	        s+=n%10;
	        n/=10;
	    }
	    if(s%2==0)
	    return true;
	    else
	    return false;
	}
}
