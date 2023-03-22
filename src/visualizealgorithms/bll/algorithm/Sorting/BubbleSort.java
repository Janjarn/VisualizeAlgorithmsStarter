package visualizealgorithms.bll.algorithm.Sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class BubbleSort extends GenericAlgorithm {

    public BubbleSort() {
        super("BubbleSort", "Slow O(N^2) sorting algorithm" , AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        // O(N^2)
        Comparable[] arr = (Comparable[]) super.getData();
        //int []b = (int[]) super.getData();

        int n = arr.length;
        Comparable temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(arr[j-1].compareTo(arr[j]) > 0){
                    //swap the elements!
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}