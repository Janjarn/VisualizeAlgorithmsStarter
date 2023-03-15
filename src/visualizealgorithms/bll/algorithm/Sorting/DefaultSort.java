package visualizealgorithms.bll.algorithm.Sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;
import java.util.Arrays;

public class DefaultSort extends GenericAlgorithm {

    public DefaultSort() {
        super("DefaultSort", "", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int []b = (int[]) super.getData();

        Arrays.sort(b);
    }
}