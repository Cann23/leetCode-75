package leetCode75;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class EqualRowAndColumnPairs_2352 {
    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}}));
        System.out.println(equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}}));
        System.out.println(equalPairs(new int[][]{{11,1},{1,11}}));
    }

    public static int equalPairs(int[][] grid) {
        AtomicInteger equalPairs = new AtomicInteger();

        Map<Integer, String> rows = new HashMap<>();
        Map<Integer, String> columns = new HashMap<>();

        for (int i = 0; i < grid.length; i++){
            String elementsOfRows = "";
            String elementsOfColumns = "";
            for (int j = 0; j < grid[i].length; j++) {
                elementsOfRows = elementsOfRows.concat("-").concat(String.valueOf(grid[i][j]));
                elementsOfColumns = elementsOfColumns.concat("-").concat(String.valueOf(grid[j][i]));
            }
            rows.put(i, elementsOfRows);
            columns.put(i, elementsOfColumns);
        }

        rows.values().stream().forEach(row -> {
            columns.values().stream().forEach(column -> {
                if (row.equals(column)) {
                    equalPairs.getAndIncrement();
                }
            });
        });

        return equalPairs.get();
    }
}
