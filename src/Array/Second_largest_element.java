package Array;

public class Second_largest_element {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5};
        int large = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > large){
                slargest = large;
                large = arr[i];
            }else {
                if(arr[i] < large && arr[i] > slargest){
                    slargest = arr[i];
                }
            }
        }
        System.out.println(slargest);
    }
}
