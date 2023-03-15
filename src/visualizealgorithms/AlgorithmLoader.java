package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.IAlgorithm;
import visualizealgorithms.bll.algorithm.Sorting.BubbleSort;
import visualizealgorithms.bll.algorithm.Sorting.DefaultSort;
import visualizealgorithms.bll.algorithm.Sorting.MergeSort;
import visualizealgorithms.bll.algorithm.Sorting.QuickSort;
import visualizealgorithms.bll.algorithm.Sorting.InsertionSort;
import visualizealgorithms.bll.algorithm.Sorting.SelectionSort;

//Java imports
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs
        inputs = "1000;2000;4000;8000;16000;32000;64000;128000;256000;";

        //Add implemented/selected algorithms here..
        algorithms.add(new BubbleSort());
        algorithms.add(new SelectionSort());
        algorithms.add(new InsertionSort());
        algorithms.add(new QuickSort());
        algorithms.add(new MergeSort());
        algorithms.add(new DefaultSort());
        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}