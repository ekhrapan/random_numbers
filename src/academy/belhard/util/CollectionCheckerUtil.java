package academy.belhard.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionCheckerUtil {
    private static final int MAX_COPIES_COUNT = 3;

    public static boolean check(List<Integer> numbers) {
        Map<Integer, Integer> copiesStatistics = new HashMap<>();

        for (int number : numbers) {
            int copiesCount = copiesStatistics.getOrDefault(number, 0);
            copiesCount++;

            if (copiesCount >= 3) {
                return false;
            }

            copiesStatistics.put(number, copiesCount);
        }

        return true;
    }
}
