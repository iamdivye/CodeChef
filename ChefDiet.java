import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 

        while (t-- > 0) {
            int n = in.nextInt(); 
            int k = in.nextInt(); 
            int storage = 0;      
            boolean enough = true;

            int[] protein = new int[n];
            for (int i = 0; i < n; i++) {
                protein[i] = in.nextInt();
            }

            for (int day = 0; day < n; day++) {
                storage += protein[day];

                if (storage < k) {
                    System.out.println("NO " + (day + 1));
                    enough = false;
                    break;
                }

                storage -= k;
            }

            if (enough) {
                System.out.println("YES");
            }
        }
        in.close();
    }
}
