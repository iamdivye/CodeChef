import java.util.*;
import java.util.stream.Collectors;

class Codechef {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] a = new int[2 * n]; 
            for (int j = 0; j < 2 * n; j++) {
                a[j] = in.nextInt();
            }
            
      
            List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
            boolean valid = true;
            for (int num : list) {
                if (Collections.frequency(list, num) > 2) {
                    valid = false;
                    break;
                }
            }
            
            System.out.println(valid ? "Yes" : "No");
        }
    }
}