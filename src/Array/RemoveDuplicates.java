package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,3,3,4,4,5};
        Set<Integer> set = new HashSet<>();

        for (int num : arr){
            set.add(num);
        }

        int [] array = new int[set.size()];
        int i= 0;

        for (int num : set){
            array[i++] = num;
        }

        System.out.println(Arrays.toString(array));
    }
}
