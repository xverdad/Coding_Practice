import java.util.*;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfQualityOfLife = scan.nextInt();
        double QALY = 0; //Quality-Adjusted Life-Year

        for (int i = 0; i < numberOfQualityOfLife; i++) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();

            QALY += a*b;
        }

        System.out.printf("%.3f", QALY);

        scan.close();
    }
}

