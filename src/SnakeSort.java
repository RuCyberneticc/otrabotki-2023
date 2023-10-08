import java.util.ArrayList;
import java.util.List;

public class SnakeSort {
    public static List<Integer> snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        
        while (array.length > 0) {
            for (int i : array[0]) {
                result.add(i);
            }
            int[][] newArray = new int[array.length - 1][];
            System.arraycopy(array, 1, newArray, 0, array.length - 1);
            array = newArray;
            
            if (array.length > 0) {
                for (int i = 0; i < array.length; i++) {
                    int lastIndex = array[i].length - 1;
                    if (lastIndex >= 0) {
                        result.add(array[i][lastIndex]);
                        array[i] = removeLastElement(array[i]);
                    }
                }
            }
            
            if (array.length > 0) {
                int lastRow = array.length - 1;
                for (int i = array[lastRow].length - 1; i >= 0; i--) {
                    result.add(array[lastRow][i]);
                }
                array = removeLastElement(array);
            }
            
            if (array.length > 0) {
                for (int i = array.length - 1; i >= 0; i--) {
                    if (array[i].length > 0) {
                        result.add(array[i][0]);
                        array[i] = removeFirstElement(array[i]);
                    }
                }
            }
        }
        
        return result;
    }

    private static int[] removeLastElement(int[] arr) {
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, arr.length - 1);
        return newArray;
    }

    private static int[][] removeLastElement(int[][] arr) {
        int[][] newArray = new int[arr.length - 1][];
        System.arraycopy(arr, 0, newArray, 0, arr.length - 1);
        return newArray;
    }

    private static int[] removeFirstElement(int[] arr) {
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 1, newArray, 0, arr.length - 1);
        return newArray;
    }


}
