package Array;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArrBrute {

    public static void main(String[] args) {

        int [] arr1 = {1,2,2,3,3,4,5};
        int [] arr2 = {1,2,3,4,5,6};
        
        Set<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            set.add(num);
        }

        System.out.print(set+" ");
    }
}
