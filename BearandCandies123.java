import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++)
		{
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int turn = 1; 
		    while(true)
		    {
		        if(turn % 2 == 1) 
		        {
		            if(a >= turn) 
		            {
		                a -= turn;
		            }
		            else
		            {
		                System.out.println("Bob");
		                break;
		            }
		        }
		        else 
		        {
		            if(b >= turn) 
		            {
		                b -= turn;
		            }
		            else
		            {
		                System.out.println("Limak");
		                break;
		            }
		        }
		        turn++;
		    }
		}
	}
}
