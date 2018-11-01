import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tarifa {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        int monthlyMemory = scan.readLine();
        int testCases = Integer.parseInt(scan.readLine());
        int totalMemoryAvailable = 0;

        for (int i = 0; i < testCases; i++) {
            totalMemoryAvailable += monthlyMemory - Integer.parseInt(scan.next());

        }
        System.out.println(totalMemoryAvailable += monthlyMemory);

        }
}
