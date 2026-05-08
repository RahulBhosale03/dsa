package Array;

public class SortedOrNot {
    public static void main(String[] args) {
        int [] arr = {6,2,3,4,5,1};
        int n = arr.length;
        boolean isSorted = true;

        for(int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                if(arr[i] < arr[j]){
                    isSorted = false;
                    break;
                }
            }
        }

        if(isSorted){
            System.out.println("array is sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
