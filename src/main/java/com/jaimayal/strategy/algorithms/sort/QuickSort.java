package com.jaimayal.strategy.algorithms.sort;

import java.util.List;

/**
 * Sorts using the QuickSort algorithm in recursive form.
 * @Average O(n*log(n)) 	
 * @Best O(n*log(n)) 	
 * @Worst O(n^2) 	
 * @Space O(n)
 */
public class QuickSort extends SortAlgorithm<String> {
    @Override
    protected void algorithm(List<String> toSort) {
        int leftIndex = 0;
        int rightIndex = toSort.size() - 1;
        
        if (leftIndex < rightIndex) {
            int pivotIndex = partitionOperation(toSort, leftIndex, rightIndex);
            algorithm(toSort, leftIndex, pivotIndex - 1);
            algorithm(toSort, pivotIndex + 1, rightIndex);
        }
    }
    
    protected void algorithm(List<String> toSort, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivotIndex = partitionOperation(toSort, leftIndex, rightIndex);
            algorithm(toSort, leftIndex, pivotIndex - 1);
            algorithm(toSort, pivotIndex + 1, rightIndex);
        }
    }

    private int partitionOperation(List<String> toSort, int leftIndex, int rightIndex) {
        String pivot = toSort.get(rightIndex);
        int i = (leftIndex - 1);

        for (int j = leftIndex; j <= rightIndex - 1; j++) {
            if (toSort.get(j).compareTo(pivot) <= 0) {
                i++;
                swapValues(toSort, i, j);
            }
        }
        swapValues(toSort, i + 1, rightIndex);
        return i + 1;
    }

    private void swapValues(List<String> listToSwapFrom, int indexOne, int indexTwo) {
        String temp = listToSwapFrom.get(indexOne);
        listToSwapFrom.set(indexOne, listToSwapFrom.get(indexTwo));
        listToSwapFrom.set(indexTwo, temp);
    }
}
