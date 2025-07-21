import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        
        if (60 <= W && 130 >= H) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
	}
}
