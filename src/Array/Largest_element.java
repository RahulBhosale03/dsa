package Array;

public class Largest_element {
    public static void main(String[] args) {
        int [] arr = {5,3,4,2,1};
        int max = arr[0];
        int n = arr.length;

        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
