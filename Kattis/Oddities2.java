import java.util.*;

// This source code uses the Scanner class to read input

// I'm trying out which one would be faster

public class Oddities2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine());
        int num;

        for (int i = 0; i < input; i++) {
            num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            }
            else {
                System.out.println(num + " is odd");
            }
        }
    }
}
