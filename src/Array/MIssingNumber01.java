package Array;

import java.util.Arrays;

public class MIssingNumber01 {

    static int missingNumber(int[]arr,int n){
        return (n*(n+1)/2) - Arrays.stream(arr).sum();
    }
    public static void main(String[] args) {
        int [] arr = {0,1,3,4};
        int n = arr.length;

        int num = missingNumber(arr,n);

        System.out.println(num);
    }
}
