import java.util.*;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfDays = scan.nextInt();
        int numberOfSubZeroDays = 0;

        System.out.println(ColdputerScience2(numberOfDays, scan));










        /*
        ArrayList<Integer> temperatures = new ArrayList<>();

        for (int i = 0; i < numberOfDays; i++) {
            temperatures.add(scan.nextInt());
        }

        //I can use temperatures.get(index) here too, but I just want to create an iterator
        Iterator<Integer> itr = temperatures.iterator();
        while (itr.hasNext()) {
            if (itr.next() < 0) {
                numberOfSubZeroDays++;
            }
        }

        /* This is a shorter version, using the ArrayList function: get()
        for (int i = 0; i < numberOfDays; i++) {
            if (temperatures.get(i) < 0) {
                numberOfSubZeroDays++;
            }
        }
        */

        //System.out.println(numberOfSubZeroDays);
        //scan.close();

    }

    // A very concise version
    public static int ColdputerScience2(int numberOfDays, Scanner scan) {
        int output = 0;

        for (int i = 0; i < numberOfDays; i++) {
            if (scan.nextInt() < 0) {
                output++;
            }
        }
        scan.close();

        return output;
    }
}
