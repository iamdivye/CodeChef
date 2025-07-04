import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		for(int k=0;k<t;k++){
		    int max=0,min=0;
		    int n=in.nextInt();
		    if(n%2==0)
		    max=n/2;
		    else
		    max=(n/2)+1;
            if (n == 1) {
                min = 1;
            } else if (n <= 3) {
                min = 1;
            } else {
                min = (n + 2) / 3;
            }
		System.out.println(max+" "+min);
		}
	}
}
