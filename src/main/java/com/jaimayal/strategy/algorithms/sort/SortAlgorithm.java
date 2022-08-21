package com.jaimayal.strategy.algorithms.sort;

import com.jaimayal.strategy.algorithms.MeasurableAlgorithm;

import java.util.List;

public abstract class SortAlgorithm<T> extends MeasurableAlgorithm {
    /**
     * Receives a List and sorts it using the equals() method of
     * the specified T class.
     * @param toSort List to sort
     */
    
    public void execute(List<T> toSort) {
        executionInterval.setStart(System.currentTimeMillis());
        algorithm(toSort);
        executionInterval.setEnd(System.currentTimeMillis());
    }
    
    abstract void algorithm(List<T> toSort);
}
