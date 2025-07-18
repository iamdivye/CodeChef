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
		    int e=in.nextInt();
		    int k=in.nextInt();
		    int length=0;
		    while(e>0){
		        e=e/k;
		        length++;
		    }
		    System.out.println(length);
		}
	}
}
