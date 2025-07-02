import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int p=0;p<t;p++)
		{
		    int n=in.nextInt();
		    String s=in.next();
		    String newChar="";  
		    for(int i=0;i<(n/2)*2;i=i+2)
		    {
		        char a=s.charAt(i);
		        char b=s.charAt(i+1);
		        newChar = newChar + Character(b) + Character(a);
		    }
		    if(n%2!=0)
		    {
		        newChar=newChar+Character(s.charAt(n-1));
		    }
		    System.out.println(newChar);
		}
	}
	static char Character(char a)
	{
	    int k=(int)a;
	    k=(122-k)+97;
	    return (char)k;
	}
}
