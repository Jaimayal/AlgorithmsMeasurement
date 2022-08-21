package com.jaimayal.strategy.algorithms.search;

import java.util.Collections;
import java.util.List;

public abstract class SortedSearchAlgorithm extends SearchAlgorithm {
    @Override
    public void execute(List<String> data, List<String> toFind) {
        Collections.sort(data);
        Collections.sort(toFind);

        executionInterval.setStart(System.currentTimeMillis());
        algorithm(data, toFind);
        executionInterval.setEnd(System.currentTimeMillis());
        totalEntries = toFind.size();
    }
}
