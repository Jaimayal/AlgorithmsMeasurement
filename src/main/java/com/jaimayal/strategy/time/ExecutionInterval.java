package com.jaimayal.strategy.time;

public class ExecutionInterval {
    private long start;
    private long end;
    
    public ExecutionInterval() {
    }

    public void setEnd(long end) {
        this.end = end;
    }
    
    public void setStart(long start) {
        this.start = start;
    }
    
    public long getExecutionMillis() {
        return this.end - this.start;
    }
}
