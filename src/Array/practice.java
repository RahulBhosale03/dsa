package Array;

public class practice {
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,2};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(arr[n-1]);
    }
}
