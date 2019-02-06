import java.util.*;

public class Datum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();

        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Thursday");
        myMap.put(2, "Sunday");
        myMap.put(3, "Sunday");
        myMap.put(4, "Wednesday");
        myMap.put(5, "Friday");
        myMap.put(6, "Monday");
        myMap.put(7, "Wednesday");
        myMap.put(8, "Saturday");
        myMap.put(9, "Tuesday");
        myMap.put(10, "Thursday");
        myMap.put(11, "Sunday");
        myMap.put(12, "Tuesday");

        Node head = new Node("Sunday");
        Node pointer = head;
        pointer.next = new Node("Monday");
        pointer.next.next = new Node("Tuesday");
        pointer.next.next.next = new Node("Wednesday");
        pointer.next.next.next.next = new Node("Thursday");
        pointer.next.next.next.next.next = new Node("Friday");
        pointer.next.next.next.next.next.next = new Node("Saturday");
        pointer.next.next.next.next.next.next.next = head;

        Node looker = new Node(myMap.get(month));
        Node looper = pointer;
        while(looker.day != looper.day) {
            looper = looper.next;
        }

        for (int i = 1; i < day; i++) {
            looper = looper.next;
        }

        System.out.println(looper.day);

        scan.close();
    }

    public static class Node {
        String day;
        Node next;
        Node(String input) {
            day = input;
        }
    }
}

