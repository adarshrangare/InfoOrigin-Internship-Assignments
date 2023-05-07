import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        String inputNumbers = sc.nextLine();
        String[] input = inputNumbers.split("\\s+");
        String waterfall = "";
        String antiwaterfall ="";
        System.out.print("Enter the X Flow start from: ");
        int x = sc.nextInt();

        for(int i = x; i < input.length; i++) {
                antiwaterfall = antiwaterfall + input[i] + "\n";
        }
        for(int i = 0; i < x; i++) {
            antiwaterfall = antiwaterfall + input[i] + "\n";
        }

        for (int i = input.length-x ; i< input.length;i++){
            waterfall = waterfall + input[i] + "\n";
        }
        for(int i = 0; i<input.length-x; i++){
            waterfall = waterfall + input[i] + "\n";
        }


        System.out.println("Waterfall\n" + waterfall);
        System.out.println("Anti-Waterfall\n" + antiwaterfall);


    }
}
