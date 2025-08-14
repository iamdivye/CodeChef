import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long totalOfficeHours = 0;
            for (int i = 0; i < 5; i++) {
                totalOfficeHours += sc.nextInt();
            }
            long P = sc.nextInt();
            
            long totalHomeHours = totalOfficeHours * P;
            long availableWeekdayHours = 5 * 24;

            if (totalHomeHours > availableWeekdayHours) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

