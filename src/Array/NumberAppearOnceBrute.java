package Array;

public class NumberAppearOnceBrute {

    public static int getSingleElement(int[]arr){

        for(int i=0;i<arr.length;i++){
            int cnt = 0;
            for(int j=0;j<arr.length;j++){

                if(arr[j] == arr[i]){
                    cnt++;
                }
            }
            if(cnt == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,4,4};

        int num = getSingleElement(arr);

        System.out.println(num);
    }
}
