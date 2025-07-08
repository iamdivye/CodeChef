import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		char c=in.next().charAt(0);
		switch(c){
		    case '+' : System.out.println(a+b);
		    break;
		    case '-' : System.out.println(a-b);
		    break;
		    case '*' : System.out.println(a*b);
		    break;
		    case '/' : System.out.println((double)a/b);
		    break;
		}
		
	}
}
