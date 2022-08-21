package com.jaimayal.strategy.algorithms.sort;

import java.util.List;

public class BubbleSort extends SortAlgorithm<String> {
    @Override
    protected void algorithm(List<String> toSort) {
        for (int i = 0; i < toSort.size() - 1; i++) {
            for (int j = 0; j < toSort.size() - i - 1; j++) {
                if (toSort.get(j + 1).charAt(0) < toSort.get(j).charAt(0)) {
                    String tempName = toSort.get(j);
                    toSort.set(j, toSort.get(j + 1));
                    toSort.set(j + 1, tempName);
                }
            }
        }
    }
}
