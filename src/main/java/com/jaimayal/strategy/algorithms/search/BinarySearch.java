package com.jaimayal.strategy.algorithms.search;

import java.util.List;

public class BinarySearch extends SortedSearchAlgorithm {

    @Override
    void algorithm(List<String> data, List<String> toFind) {
        for (String find : toFind) {
            int leftIndex = 0;
            int rightIndex = data.size() - 1;
            while (leftIndex <= rightIndex) {
                int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;

                if (data.get(middleIndex).equals(find)) {
                    ++foundEntries;
                    break;
                } else if (data.get(middleIndex).compareTo(find) > 0) {
                    rightIndex = middleIndex - 1;
                } else {
                    leftIndex = middleIndex + 1;
                }
            }
        }
    }
}