package com.jaimayal;

import com.jaimayal.strategy.algorithms.search.SearchAlgorithm;

import java.util.List;

public class SearchExecutor {
    private SearchAlgorithm actualAlgorithm;

    public void setMethod(SearchAlgorithm algorithm) {
        this.actualAlgorithm = algorithm;
    }

    public void search(List<String> directoryData, List<String> peopleToFind) {
        actualAlgorithm.execute(directoryData, peopleToFind);
    }
    
    public void printAlgorithmExecutionResults() {
        actualAlgorithm.printSearchResults();
        actualAlgorithm.printExecutionTime();
    }
}
