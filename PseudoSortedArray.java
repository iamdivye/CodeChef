import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Find all disorder indices
            List<Integer> bad = new ArrayList<>();
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] > arr[i + 1]) bad.add(i);
            }

            if (bad.isEmpty()) {
                System.out.println("YES");
            } else if (bad.size() > 1) {
                System.out.println("NO");
            } else {
                int idx = bad.get(0);
                swap(arr, idx, idx + 1);
                if (isSorted(arr)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
