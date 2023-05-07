
import java.util.Scanner;

public class HackerRankLexo {




    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String [] sArr = new String[s.length()-k+1];

        for(int i=0;i<sArr.length;i++){
            sArr[i] = s.substring(i,i+k);

            System.out.print(sArr[i] +" ");
        }



        for (int i=0;i< sArr.length-1;i++) {
            for (int j = 0; j < sArr.length - i - 1; j++) {
                if (sArr[j].compareTo(sArr[j + 1]) > 0) {
                    String temp = sArr[j];
                    sArr[j]=sArr[j+1];
                    sArr[j+1]=temp;
                }
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        System.out.println();

        for(int i=0;i<sArr.length;i++){


            System.out.print(sArr[i] +" ");
        }
        System.out.println();
        smallest = sArr[0];
        largest = sArr[sArr.length-1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "welcometojava";
        int k = 3;
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}