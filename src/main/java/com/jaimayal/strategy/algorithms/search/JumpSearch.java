package com.jaimayal.strategy.algorithms.search;

import java.util.List;

public class JumpSearch extends SortedSearchAlgorithm {
    @Override
    void algorithm(List<String> data, List<String> toFind) {
        for (String find : toFind) {
            int blockSize = (int) (Math.floor(Math.sqrt(data.size())));
            int currentLastIndex = blockSize-1;

            // Jump to next block as long as target element is > currentLastIndex
            // and the array end has not been reached
            while (currentLastIndex < data.size() && find.charAt(0) > data.get(currentLastIndex).charAt(0)) {
                currentLastIndex += blockSize;
            }


            // Find accurate position of target element using Linear Search
            for (int currentSearchIndex = currentLastIndex - blockSize + 1;
                 currentSearchIndex <= currentLastIndex + (data.size() / 8) && currentSearchIndex < data.size(); currentSearchIndex++) {
                if (find.equals(data.get(currentSearchIndex))) {
                    ++foundEntries;
                    break;
                }
            }
        }
    }
}
