import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            double N = scanner.nextDouble();
            double V1 = scanner.nextDouble();
            double V2 = scanner.nextDouble();

            double timeStairs = (N * Math.sqrt(2)) / V1;
            double timeElevator = (2 * N) / V2;

            if (timeElevator <= timeStairs) {
                System.out.println("Elevator");
            } else {
                System.out.println("Stairs");
            }
        }
    }
}