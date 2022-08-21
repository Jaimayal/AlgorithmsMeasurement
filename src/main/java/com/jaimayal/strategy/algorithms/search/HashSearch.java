package com.jaimayal.strategy.algorithms.search;

import com.jaimayal.strategy.time.ExecutionInterval;
import com.jaimayal.strategy.time.ExecutionTimestamp;

import java.util.HashSet;
import java.util.List;

public class HashSearch extends SearchAlgorithm {
    private HashSet<String> dataHash;
    private HashSet<String> toFindHash;
    private boolean isInitialized = false;
    private ExecutionTimestamp creationTimestamp;
    
    @Override
    void algorithm(List<String> data, List<String> toFind) {
        if (!isInitialized) {
            ExecutionInterval interval = new ExecutionInterval();
            interval.setStart(System.currentTimeMillis());
            dataHash = new HashSet<>(data);
            toFindHash = new HashSet<>(toFind);
            interval.setEnd(System.currentTimeMillis());
            creationTimestamp = new ExecutionTimestamp(interval.getExecutionMillis());
            isInitialized = true;
        }
        
        executionInterval.setStart(System.currentTimeMillis());
        for (String find : toFindHash) {
            if (dataHash.contains(find)) {
                ++foundEntries;
            }
        }
    }
    
    public void printCreationTimestamp() {
        creationTimestamp.printExecutionTimestamp();
    }
}
