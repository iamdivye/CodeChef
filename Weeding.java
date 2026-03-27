import java.util.*;
import java.io.*;

public class Weeding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int N = Integer.parseInt(firstLine[0]);
            long M = Long.parseLong(firstLine[1]);
            long K = Long.parseLong(firstLine[2]);
            
            String[] secondLine = br.readLine().split(" ");
            boolean possible = true;
            
            for (int i = 0; i < N; i++) {
                long A = Long.parseLong(secondLine[i]);
                if (M - A + 1 < K) {
                    possible = false;
                    break;
                }
            }
            
            pw.println(possible ? "Yes" : "No");
        }
        
        pw.flush();
        pw.close();
    }
}