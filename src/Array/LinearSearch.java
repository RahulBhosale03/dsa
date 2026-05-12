package Array;

public class LinearSearch {

    static int Search(int [] arr,int n ,int k){
        for(int i=0;i<n;i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;

        int num = Search(arr,n,k);

        System.out.print(num);
    }
}
