import java.io.*;
import java.util.*;

public class Oddities {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer tok = new StringTokenizer(buff.readLine()); // StringTokenizer can take in String objects

        //StringTokenizer is good for reading multiple tokens in a line, because
        // StringTokenizer has a delimiter function to separate the String inputs.

        int input = Integer.parseInt(buff.readLine());
        int num;

        for (int i = 0; i < input; i++) {
            num = Integer.parseInt(buff.readLine());
            if (num % 2 == 0) {
                System.out.println(num + " is even");
            }
            else {
                System.out.println(num + " is odd");
            }
        }

        buff.close();
    }
}
