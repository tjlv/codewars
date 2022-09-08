import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
[7, 1]  =>  [1, 7]
[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]
 */
public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        //init arraylist
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        //take out all uneven numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                intArray.add(array[i]);
                array[i] = -1;
            }
        }

        //sort all uneven numbers ascending
        Collections.sort(intArray);

        //replace all -1 with uneven numbers
        for (int i = 0; i < array.length; i++) {
            if (array[i]== -1 && intArray.size() > 0) {
                array[i] = intArray.get(0);
                intArray.remove(0);
            }
        }

        //return filtered array
        return array;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(sortArray(new int[]{7, 1})));
//        System.out.println(Arrays.toString(sortArray(new int[]{5, 8, 6, 3, 4})));
        System.out.println(Arrays.toString(sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }
}
