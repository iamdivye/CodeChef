import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n = in.nextInt();
		    int a[] = new int[n];
		    for(int j=0;j<n;j++)
		    {
		        a[j] = in.nextInt();
		    }
		    int b[]= new int[n];
		    boolean k=false;
		    for(int j=0;j<n;j++)
		    {
		        if(a[j] > n)
		        {
		            k=true;
		            break;
		        }
		        else
		        {
		            b[a[j]-1]+=1;
		        }
		    }
		    if(k)
		    System.out.println("NO");
		    else
		    {
		        int x=0;
		        boolean flag = false;
		        for(int j=0;j<n;j++)
		        {
		            if(b[j] >= 1)
		            {
		                b[j]-=1;
		                x+=b[j];
		            }
		            else if(x>0)
		            {
		                x-=1;
		            }
		            else
		            {
		                flag = true;
		                break;
		            }
		        }
		        if(flag)
		        System.out.println("NO");
		        else
		        System.out.println("YES");
		    }
		}

	}

}
