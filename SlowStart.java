import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x = in.nextInt();
            int h = in.nextInt();
            int turns = 0;
            int damage = 0;
            while (turns < 5 && damage < h) {
                damage += x / 2;
                turns++;
            }
            if (damage < h) {
                int remaining = h - damage;
                turns += (remaining + x - 1) / x; 
            }
            System.out.println(turns);
        }
    }
}