import java.io.IOException;
import java.util.List;

public class goldmanq2 {
    public static void main(String[] args) throws IOException {

    }

    static int FindMinSlice(List<List<Integer>> Matrix){
        int rows = Matrix.size();
        if (rows == 0)
            return 0;
        int columns = Matrix.get(0).size();
        if (columns == 0)
            return 0;
        int sliceSum[] = new int[columns];
        for (int i = 0; i < columns; i++)
            sliceSum[i] = Matrix.get(rows - 1).get(i);
        for (int i = rows - 2; i >= 0; i--)
        {
            for (int j = columns - 1; j >= 0; j--) {
                if (j == columns - 1)
                    sliceSum[j] = Math.min(sliceSum[j - 1], sliceSum[j]) + Matrix.get(i).get(j);
                else if (j == 0)
                    sliceSum[j] = Math.min(sliceSum[j], sliceSum[j + 1]) + Matrix.get(i).get(j);
                else
                    sliceSum[j] = Math.min(sliceSum[j - 1], Math.min(sliceSum[j], sliceSum[j + 1])) + Matrix.get(i).get(j);
            }
        }
        int minSliceSum = sliceSum[0]; 
        for (int i = 1; i < columns; i++)
            minSliceSum = Math.min(minSliceSum, sliceSum[i]);
        return minSliceSum;
    }
}

