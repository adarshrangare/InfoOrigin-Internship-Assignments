import java.util.Scanner;

public class PalindromeString {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = "madam";
        /* Enter your code here. Print output to STDOUT. */
        String reverseOfA = "";
        for (int i = A.length() - 1; i >= 0; i--) {

            reverseOfA = reverseOfA + A.charAt(i);

        }

        System.out.println(reverseOfA);

        if (A.equalsIgnoreCase(reverseOfA)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }
}