import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UniqueU {
    public static SortedSet<Integer> generateU(int limit) {
        Set<Integer> u = new HashSet<>();
        
        for (int x = 0; x < limit; x++) {
            int y = 2 * x + 1;
            int z = 3 * x + 1;
            u.add(1);
            u.add(y);
            u.add(z);
        }
        
        return new TreeSet<>(u);
    }


}
