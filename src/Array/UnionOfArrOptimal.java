package Array;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArrOptimal {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4,5};
        int[] arr2 = {4,4,5,6};

        int right = 0 , left = 0;

        List<Integer> res = new ArrayList<>();

        while (left< arr1.length || right< arr2.length){

            //  SKIP DUPLICATES

            while (left>0 && left<arr1.length && arr1[left] == arr1[left - 1]){
                left++;
            }
            while (right>0 && right< arr2.length && arr2[right] == arr2[right - 1]){
                right++;
            }


            //ONE ARRAY EXHAUSTED

            if(left>=arr1.length){
                res.add(arr2[right]);
                    right++;
                    continue;
            }

            if(right>=arr2.length){
                res.add(arr1[left]);
                    left++;
                    continue;
            }


            //SIZE COMPARISON BETWEEN ARR1 AND ARR2

            if(arr1[left] < arr2[right]){
                res.add(arr1[left]);
                    left++;
            }else if(arr1[left] > arr2[right]){
                res.add(arr2[right]);
                right++;
            }else {
                res.add(arr1[left]);
                right++;
                left++;
            }
        }
        System.out.print(res+" ");
    }
}
