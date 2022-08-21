package com.jaimayal.strategy.algorithms.search;

import java.util.List;

public class LinearSearch extends SearchAlgorithm {
    @Override
    void algorithm(List<String> data, List<String> toFind) {
        for (String find : toFind) {
            for (String element : data) {
                if (find.equals(element)) {
                    foundEntries++;
                }
            }
        }
    }
}
