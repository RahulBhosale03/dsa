package Array;

public class Remove_duplicates_Unsorted_arr {
    public static void main(String[] args) {

        int [] arr = {2,2,1,1,2,2,3,3,4};
        int n = arr.length;

        for(int i=0;i<n;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
