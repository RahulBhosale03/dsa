package Array;

public class NumberAppearOnceOptimal {

    public static int getSingleElement(int[]arr){

        int xor = 0;

        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,4};
        int num = getSingleElement(arr);
        System.out.println(num);
    }
}
