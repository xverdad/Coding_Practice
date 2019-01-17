import java.util.*;

public class Bela {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfHands = scan.nextInt() * 4;
        String dominantSuit = scan.next();
        String hand;
        int score = 0;

        for (int i = 0; i < numberOfHands; i++) {
            hand = scan.next();
            score += score(dominantSuit, hand);
        }

        System.out.println(score);
        scan.close();
    }


    public static int score(String dominantSuit, String hand) {
        int score = 0;
        if (hand.substring(1, 2).equals(dominantSuit)) {
            if (hand.charAt(0) == 'A') {
                score = 11;
            }
            else if (hand.charAt(0) == 'K') {
                score = 4;
            }
            else if (hand.charAt(0) == 'Q') {
                score = 3;
            }
            else if (hand.charAt(0) == 'J') {
                score = 20;
            }
            else if (hand.charAt(0) == 'T') {
                score = 10;
            }
            else if (hand.charAt(0) == '9') {
                score = 14;
            }
            else if (hand.charAt(0) == '8') {
                score = 0;
            }
            else if (hand.charAt(0) == '7') {
                score = 0;
            }
        }
        else {
            if (hand.charAt(0) == 'A') {
                score = 11;
            }
            else if (hand.charAt(0) == 'K') {
                score = 4;
            }
            else if (hand.charAt(0) == 'Q') {
                score = 3;
            }
            else if (hand.charAt(0) == 'J') {
                score = 2;
            }
            else if (hand.charAt(0) == 'T') {
                score = 10;
            }
            else if (hand.charAt(0) == '9') {
                score = 0;
            }
            else if (hand.charAt(0) == '8') {
                score = 0;
            }
            else if (hand.charAt(0) == '7') {
                score = 0;
            }
        }

        return score;
    }
}
