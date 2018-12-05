import java.util.*;

public class R2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int R1 = scan.nextInt();
        int avg = scan.nextInt();

        System.out.println((avg*2) - R1);

        scan.close();
    }
}
