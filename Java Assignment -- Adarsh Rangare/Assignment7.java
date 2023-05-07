import java.util.Scanner;

class Assignment7 {

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    left = i;
                    right = j;
                    break;
                }
            }
        }
        return new int[]{left, right};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array separated with space");
        String input = sc.nextLine();
        String[] inputElements = input.split("\\s+");
        int[] arr = new int[inputElements.length];

        for(int i=0;i<inputElements.length;i++){
            try{ arr[i] = Integer.parseInt(inputElements[i]);}
            catch (Exception e){
                System.out.println("Enter the valid Array "+ "Error: "+ e);
                return;
            }
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate number is not allowed " + arr[i]+ " is Duplicate");
                    return;
                }}
        }
        System.out.println("Enter the target Number");
        int target = sc.nextInt();

        int[] result = twoSum(arr, target);

        if(result[0]==0 || result[1]==0 ){
            System.out.println("No pair of numbers in the array add up to the target");
        }else{
        System.out.println("index: " + result[0] + " " + result[1]);}
    }
}