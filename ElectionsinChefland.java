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
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    if(a>50)
		    System.out.println("A");
		    else if(b>50)
		    System.out.println("B");
		    else if(c>50)
		    System.out.println("C");
		    else
		    System.out.println("NOTA");
		}

	}
}
