import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size mảng :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập các phần tử của mảng :");
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,5));
    }
    public static int binarySearch(int[]array,int value){
        int left = 0;
        int right = array.length -1;

        for (int i = 0; i < array.length; i++) {
            int middle = (left + right)/2;
            if (array[middle] == value){
                return middle;
            }else {
                right = middle-1;
            }
        }
        return -1;
    }
}