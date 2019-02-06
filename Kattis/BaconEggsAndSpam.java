import java.util.*;

public class BaconEggsAndSpam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cycles = Integer.parseInt(scan.nextLine());
        String[] input;
        HashMap<String, List<String>> myMap = new HashMap<>();
        List<String> temp;

        for (int i = 0; i < cycles; i++) {
            input = scan.nextLine().split(" ");
            for (int j = 1; j < input.length; j++) {
                if (!myMap.containsKey(input[j])) {
                    List<String> myList = new ArrayList<>();
                    myList.add(input[0]);
                    myMap.put(input[j], myList);
                }
                else {
                    temp = myMap.get(input[j]);
                    temp.add(input[0]);
                    myMap.put(input[j], temp);
                }
            }
            if (i + 1 == cycles) {
                cycles = Integer.parseInt(scan.nextLine());
                i = -1;
                Set<String> keys = myMap.keySet();
                Iterator<String> itr = keys.iterator();
                List<String> sortedItr = new ArrayList<>();
                while(itr.hasNext()) {
                    sortedItr.add(itr.next());
                }
                Collections.sort(sortedItr);

                for (String s : sortedItr) {
                    temp = myMap.get(s);
                    Collections.sort(temp);
                    System.out.print(s + " ");
                    for (String a : temp) {
                        System.out.print(a + " ");
                    }
                    System.out.println();
                }
                myMap.clear();
                System.out.println();
            }
        }

        scan.close();
    }
}
