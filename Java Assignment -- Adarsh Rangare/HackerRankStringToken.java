import java.io.*;
import java.util.*;
public class HackerRankStringToken {




        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.
            scan.close();

            String [] strArr = new String[s.length()];

            strArr = s.split("[!,?._'@\\s]+");
            int tokensCount=0;


            for( int i = 0;i<strArr.length;i++){

                if(strArr.length>0){
                    tokensCount++;
                }



            }
            System.out.println(strArr.length);

            for(int i =0;i<strArr.length;i++){
                System.out.println(strArr[i]);
            }

        }
    }



