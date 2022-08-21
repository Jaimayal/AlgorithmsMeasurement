package com.jaimayal.strategy.algorithms.search;

import com.jaimayal.strategy.algorithms.MeasurableAlgorithm;

import java.util.List;

public abstract class SearchAlgorithm extends MeasurableAlgorithm {
    protected int foundEntries = 0;
    protected int totalEntries = 0;

    public void printSearchResults() {
        System.out.printf("Found %d / %d entries.\n", foundEntries, totalEntries);
    }
    
    public void execute(List<String> data, List<String> toFind) {
        executionInterval.setStart(System.currentTimeMillis());
        algorithm(data, toFind);
        executionInterval.setEnd(System.currentTimeMillis());
        totalEntries = toFind.size();
    }
    
    abstract void algorithm(List<String> data, List<String> toFind);
}
