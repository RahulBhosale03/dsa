package Array;

public class Reverse_array {

    public static void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for (int num : arr) {
            System.out.print(num + " ");
        }
        reverse(arr);
        System.out.println();

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
