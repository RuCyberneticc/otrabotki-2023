import java.util.List;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        fib();
        snake();
    }

    public static void uniqueU() {
        int limit = 10;
        SortedSet<Integer> result = UniqueU.generateU(limit);
        System.out.println(result);
    }

    public static void snake() {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result1 = SnakeSort.snail(array1);
        System.out.println(result1);

        int[][] array2 = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        List<Integer> result2 = SnakeSort.snail(array2);
        System.out.println(result2);
    }


    public static void fib() {
        int n = 10;
        int result = Fibonacci.fib(n);
        System.out.println(result);
    }
}