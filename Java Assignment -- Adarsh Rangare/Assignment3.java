import java.util.Scanner;
public class Assignment3 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Sentence: ");
            String inputSentence = sc.nextLine();
            String[] words = inputSentence.split("\\s+");
            String result = "";
            for(int i = 0; i < words.length; i++) {
                if(i%2 == 0) {
                    result = result + words[i] + ",";
                }
            }
            result = result.substring(0, result.length()-1);
            System.out.println("Output: " + result);
        }
    }

