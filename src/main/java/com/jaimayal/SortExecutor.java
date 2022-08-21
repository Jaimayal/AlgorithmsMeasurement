package com.jaimayal;

import com.jaimayal.strategy.algorithms.search.SearchAlgorithm;
import com.jaimayal.strategy.algorithms.sort.SortAlgorithm;

import java.util.List;

public class SortExecutor {
    private SortAlgorithm<String> actualAlgorithm;

    public void setMethod(SortAlgorithm<String> algorithm) {
        this.actualAlgorithm = algorithm;
    }

    public void sort(List<String> toSort) {
        actualAlgorithm.execute(toSort);
    }

    public void printAlgorithmExecutionResults() {
        actualAlgorithm.printExecutionTime();
    }
}
