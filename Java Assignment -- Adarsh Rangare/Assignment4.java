import java.util.Scanner;
import java.util.*;
import java.util.HashSet;

public class Assignment4 {
    public static void main(String[] args) {
        //  10 -20 -2 4 -7 11 -22 9 }
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // to Store Elements
        ArrayList<Integer> posNum = new ArrayList<Integer>(); // Store positive elements
        ArrayList<Integer> negNum = new ArrayList<Integer>(); // Store Negative Elements
        int positive = 0;  //Count of Pos Numbers
        int negative = 0;  // Count of Neg Numbers
        System.out.println("Enter the Elements with space finished with } :");
        while (sc.hasNextInt()) {
            String input = sc.next();
            if (input.equals("}")) //breaking the While loop for input with }
            {
                break;
            }

                int num = Integer.parseInt(input);  // getting integer value of input variable
                if (num > 0) {
                    positive++;
                    posNum.add(num);
                } else {
                    negative++;
                    negNum.add(num);
                }
                numbers.add(num);  // finally added elements to array


        }
        if (numbers.size() % 2 == 0){     //Count of Elements are sum numbers
            if (positive == negative){  // Checking count of positive and negative numbers is equal

                for (int i = 0; i < numbers.size(); i++) {
                    for (int j = 0; j < i; j++) {
                        if (numbers.get(i) == numbers.get(j)) {    //checking which number is duplicate
                            System.out.println(numbers.get(i) + " is already entered");
                        }
                    }
                }

                Collections.sort(negNum); //negative number in ascending
                Collections.sort(posNum, Collections.reverseOrder()); // positive number in descending

                for (int i=0; i<posNum.size();i++){
                    System.out.print(" " + posNum.get(i) + " " + negNum.get(i));
                }
            }
            else {
                System.out.println("Enter the Equal No. of Positive and Negative Integer elements");
            }

        }
        else { System.out.println("Enter the Even number of Integer Elements");}

    }
}