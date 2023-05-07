import java.util.Scanner;

public class Assignment6 {


    public static int addDigit(int x){
        int y=0;
        while (x != 0) {
            int digit = x % 10;
            y += digit;
            x = x / 10;

        }return y;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements, (Elements should be 3 digit numbers)");
        String input = sc.nextLine();
        String[] inputElements = input.split("\\s+");
        int[] elements = new int[inputElements.length];
        int [] sum = new int[inputElements.length];

        int allSum = 0;
        boolean digit3 = true;
        int[] sum2 = new int[inputElements.length];
        for (int i = 0; i < inputElements.length ; i++) {
            int num = Integer.parseInt(inputElements[i]);
            elements[i] = num;
        }
        for (int i = 0; i < inputElements.length ; i++) {
            if (100 <= Math.abs(elements[i]) && Math.abs(elements[i]) <= 999) {


                sum[i] = addDigit(elements[i]);

                sum2[i] = addDigit(sum[i]);



            }
            else {
                digit3 = false;
                System.out.println("enter 3 digits"); }

            }
        if(digit3){
        for (int i :sum){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : sum2) {
            System.out.print(i + " ");
        }
            for (int j : sum2) {

                allSum += j;

            }

            System.out.println();
            System.out.println("Sum of all numbers: " + allSum);

        }

    }


    }





