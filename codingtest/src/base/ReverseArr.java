package base;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
    private static int[] reverseArr(int[] arr){
        return reverse(arr, 0, arr.length - 1);
    }

    private static int[] reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
        return arr;
    }
}