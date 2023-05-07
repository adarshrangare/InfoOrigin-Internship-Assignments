
import java.util.*;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int j = 1;
        for (int i = 0; i < numbers.length; i++) {
            int input = sc.nextInt();
            if(input >= 1 && input <= 100){
                numbers[i] = input;
            }else{

                System.out.println("Enter " + (i+j) + "th number between 1 to 100");
                j++;
                i--;
            }
        }


        String even = "Even Numbers: ";
        String odd = "Odd Numbers: ";

        for(int i =0;i<size;i++){
//
            if(numbers[i]%2 ==0){
                even = even + numbers[i] + " "  ;
            }else{
                odd = odd + numbers[i] + " ";
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
