
import java.util.*;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word: ");
        String words = sc.nextLine();
        System.out.println("Numbers of letters: " + words.length());
        String result="";
        for (int i = 0; i < words.length(); i++) {
//            System.out.print(words + ",");
            result += (words + ",");
        }
        System.out.println(result.substring(0,result.length()-1));
    }
}
