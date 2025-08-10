import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String gestures = sc.next();
            boolean isIndian = false;
            boolean isNotIndian = false;
            
            for (char gesture : gestures.toCharArray()) {
                if (gesture == 'I') {
                    isIndian = true;
                    break;
                } else if (gesture == 'Y') {
                    isNotIndian = true;
                    break;
                }
            }
            
            if (isIndian) {
                System.out.println("INDIAN");
            } else if (isNotIndian) {
                System.out.println("NOT INDIAN");
            } else {
                System.out.println("NOT SURE");
            }
        }
    }
}