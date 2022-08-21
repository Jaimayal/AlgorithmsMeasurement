package com.jaimayal.strategy.time;

public class ExecutionTimestamp {
    private final long minutes;
    private final long seconds;
    private final long miliseconds;
    
    public ExecutionTimestamp(long executionMillis) {
        this.minutes = executionMillis / 60000;
        this.seconds = executionMillis / 1000;
        this.miliseconds = executionMillis % 1000;
    }
    
    public void printExecutionTimestamp() {
        System.out.printf("Time taken: %d min. %d sec. %d ms.\n", minutes, seconds, miliseconds);
    }
}
