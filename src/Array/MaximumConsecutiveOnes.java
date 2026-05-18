package Array;

public class MaximumConsecutiveOnes {

    public static int count(int []arr){

        int cnt = 0;
        int max = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            max = Math.max(max,cnt);
        }

        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1,0,1,1};
        int num = count(arr);

        System.out.println("The maximum count of the ones is : "+num);

    }
}
