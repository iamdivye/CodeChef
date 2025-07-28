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
		    int A=in.nextInt();
		    int B=in.nextInt();
		    int C=in.nextInt();
		    int D=in.nextInt();
		    int E=in.nextInt();
		    boolean travel=false;
		    if((B + C <= D && A <= E) || (A + C <= D && B <= E) || (A + B <= D && C <= E)){
		        travel=true;
		    }
		    if(travel)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}

	}
}