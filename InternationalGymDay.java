import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int D = in.nextInt();
            int X = in.nextInt(); 
            int Y = in.nextInt(); 
            boolean found = false;
            int minSessions = -1;
            for (int s = 0; s <= 100; s++) {
                int discountPercent = s * D;
                if (discountPercent > 100) break;
                double discountedPrice = X * (1 - discountPercent / 100.0);
                double totalCost = s + discountedPrice;
                if (totalCost <= Y) {
                    minSessions = s;
                    found = true;
                    break; 
                }
            }

            System.out.println(found ? minSessions : -1);
        }
    }
}
