package com.jaimayal.strategy.algorithms;

import com.jaimayal.strategy.exceptions.AlgorithmNotExecutedException;
import com.jaimayal.strategy.time.ExecutionInterval;
import com.jaimayal.strategy.time.ExecutionTimestamp;

public abstract class MeasurableAlgorithm {
    protected ExecutionInterval executionInterval = new ExecutionInterval();
    
    public void printExecutionTime() throws AlgorithmNotExecutedException {
        if (executionInterval.getExecutionMillis() <= 0) {
            throw new AlgorithmNotExecutedException("The algorithm has not been executed yet");
        }
        
        long executionMillis = executionInterval.getExecutionMillis();
        ExecutionTimestamp executionTimestamp = new ExecutionTimestamp(executionMillis);
        executionTimestamp.printExecutionTimestamp();
    }
}
