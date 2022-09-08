package Professional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */
public class SortTheOddProfessional {

    public static int[] sortArray(int[] array) {

        final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        for (int j = 0, s = 0; j < array.length; j++) {
            if (array[j] % 2 == 1) array[j] = sortedOdd[s++];
        }

        return array;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sortArray(new int[]{7, 1})));
//        System.out.println(Arrays.toString(sortArray(new int[]{5, 8, 6, 3, 4})));
       sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    }
}
