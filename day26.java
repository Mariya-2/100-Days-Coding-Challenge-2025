import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");

        for (String part : parts) {
            String[] split = part.split(":");
            String word = split[0];
            String number = split[1];

            int sum = 0;
            for (char c : number.toCharArray()) {
                int d = c - '0';
                sum += d * d;
            }

            if (sum % 2 == 0) {

                word = word.charAt(word.length() - 1) + word.substring(0, word.length() - 1);
            } else {

                word = word.substring(2) + word.substring(0, 2);
            }

            System.out.println(word);
        }
    }
}
