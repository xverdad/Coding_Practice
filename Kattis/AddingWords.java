import java.util.*;

public class AddingWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input;
        HashMap<String, Integer> encoder = new HashMap<>();
        HashMap<Integer, String> decoder = new HashMap<>();
        int calc;
        boolean unknown;
        int replace;

        while (scan.hasNextLine()) {
            input = scan.nextLine().split(" ");
            calc = 0;
            unknown = false;
            if("def".equals(input[0])) {
                if (encoder.containsKey(input[1])) {
                    replace = encoder.get(input[1]);
                    encoder.remove(input[1]);
                    decoder.remove(replace);
                }
                encoder.put(input[1], Integer.parseInt(input[2]));
                decoder.put(Integer.parseInt(input[2]), input[1]);
            }
            else if ("calc".equals(input[0])) {
                if (!encoder.containsKey(input[1])) {
                    unknown = true;
                }
                else {
                    calc = encoder.get(input[1]);
                }
                for (int i = 1; i < input.length; i++) {
                    if (!input[i].equals("+") && !input[i].equals("-") && !input[i].equals("=")) {
                        if (!encoder.containsKey(input[i])) {
                            unknown = true;
                        }
                        else if (i > 1 && !unknown){
                            if (input[i - 1].equals("+")) {
                                calc += encoder.get(input[i]);
                            } else if (input[i - 1].equals("-")) {
                                calc -= encoder.get(input[i]);
                            }
                        }
                    }
                    System.out.print(input[i] + " ");
                }

                if (unknown || decoder.get(calc) == null) {
                    System.out.println("unknown");
                }
                else if (decoder.get(calc) != null){
                    System.out.println(decoder.get(calc));
                }
            }
            else if ("clear".equals(input[0])) {
                encoder.clear();
                decoder.clear();
            }
        }
        scan.close();
    }
}
