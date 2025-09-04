import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] hole1 = {"A", "D", "O", "P", "Q", "R"};
        Set<Character> oneHole = new HashSet<>();
        for (String s : hole1) oneHole.add(s.charAt(0));
        for (int test = 0; test < T; test++) {
            String text = sc.next();
            int holes = 0;
            for (char c : text.toCharArray()) {
                if (c == 'B') holes += 2;
                else if (oneHole.contains(c)) holes += 1;
            }
            System.out.println(holes);
        }
    }
}
