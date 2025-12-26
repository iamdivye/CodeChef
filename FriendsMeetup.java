import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            
            if (x1 >= x2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}