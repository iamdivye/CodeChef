import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		while(t-- > 0){
		    int n = in.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            int max = 0;
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
                min = Math.min(min,arr[i]);
                max = Math.max(max,arr[i]);
            }
            if(max-min-1>=0){
                System.out.println(max-min-1);
            }else{
                System.out.println(0);
            }
        }
	}
}
