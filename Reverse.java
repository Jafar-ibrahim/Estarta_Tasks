import java.util.Arrays;
import java.util.Scanner;

class Reverse {
    public static void main(String args[]) {
        reverseArray();
    }
    public static void reverseArray(){
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of the array");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Input array is : " + Arrays.toString(arr));
        int left = 0 , right = size-1 ;
        while(left < right){
            // just switching elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            ++left;
            --right;
        }

        System.out.println("Reverse of the input array is : "+ Arrays.toString(arr));
    }

}