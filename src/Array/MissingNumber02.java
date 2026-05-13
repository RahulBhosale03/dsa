package Array;

public class MissingNumber02 {

    static int missingNumber(int[]arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res ^ i ^ arr[i];
        }
        return res ^ arr.length;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,4};
        int num = missingNumber(arr);
        System.out.println(num);
    }
}
